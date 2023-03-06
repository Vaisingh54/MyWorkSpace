package com.productapp.demoprod.controller;


import com.productapp.demoprod.dto.ProductRequest;
import com.productapp.demoprod.dto.ProductResponse;
import com.productapp.demoprod.entity.Product;
import com.productapp.demoprod.repo.ProdRepo;
import com.productapp.demoprod.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class Controller {

    private final ProductService prodSer;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addProd(@RequestBody ProductRequest productReq)
    {
       prodSer.createProduct(productReq);

    }

    @GetMapping
    public List<ProductResponse> getAllProduct()
    {
            return prodSer.getallProduct();
    }

}
