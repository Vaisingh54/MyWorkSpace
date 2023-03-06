package com.productapp.demoprod;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.productapp.demoprod.dto.ProductRequest;
import com.productapp.demoprod.dto.ProductResponse;
import com.productapp.demoprod.entity.Product;
import com.productapp.demoprod.repo.ProdRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.utility.DockerImageName;

import java.math.BigDecimal;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@Testcontainers
@AutoConfigureMockMvc
class DemoprodApplicationTests {

	@Autowired
	private MockMvc mockMvc;
    @Autowired
	private ObjectMapper objectMapper;
    @Autowired
	private ProdRepo prodRepo;

	@Container
	static MongoDBContainer mongoDBContainer = new MongoDBContainer("mongo:4.4.2");

	@DynamicPropertySource
	static void addProperties(DynamicPropertyRegistry dynamicPropertyRegistry)
	{
		dynamicPropertyRegistry.add("spring.data.mongodb.uri",mongoDBContainer::getReplicaSetUrl);
	}

	@Test
	void testCreateProduct() throws Exception {
		ProductRequest productRequest = getProductRequest();
		String productReq = objectMapper.writeValueAsString(productRequest);
		mockMvc.perform(MockMvcRequestBuilders.post("/api/product")
				.contentType(MediaType.APPLICATION_JSON)
				.content(productReq)
		).andExpect(status().isCreated());
		Assertions.assertEquals(1, prodRepo.findAll().size());
     }

	private ProductRequest getProductRequest() {
               return ProductRequest.builder()
				.name("Iphone 30")
				.disc("my phone good")
				.price(BigDecimal.valueOf(454545))
				.build();
	}

	@Test
	void testGetProduct() throws Exception {
		ProductResponse productResponse = getProductResponse();
		String productRes = objectMapper.writeValueAsString(productResponse);
		mockMvc.perform(MockMvcRequestBuilders.get("/api/product"))
				.equals(productRes);
	}

	private ProductResponse getProductResponse() {

		Product prod = new Product();

		return ProductResponse.builder()
				.name(prod.getName())
				.disc(prod.getDisc())
				.id(prod.getId())
				.price(prod.getPrice())
				.build();
	}

}
