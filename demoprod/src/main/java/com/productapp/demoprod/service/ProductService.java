package com.productapp.demoprod.service;


import com.productapp.demoprod.dto.ProductRequest;
import com.productapp.demoprod.dto.ProductResponse;
import com.productapp.demoprod.entity.Product;
import com.productapp.demoprod.repo.ProdRepo;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

    private final ProdRepo prodRepo;

    public void createProduct(ProductRequest productReq)
    {
        Product product = Product.builder()
                .name(productReq.getName())
                .disc(productReq.getDisc())
                .price(productReq.getPrice())
                .build();

        prodRepo.save(product);
        log.info("Product {} is added..Chill", product.getId());

     }

    public List<ProductResponse> getallProduct() {

        List<Product> products=prodRepo.findAll();

        return products.stream().map(this::mapProductToProductResponse).toList();
    }

    private ProductResponse mapProductToProductResponse(Product product) {

        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .disc(product.getDisc())
                .price(product.getPrice())
                .build();
    }
}
