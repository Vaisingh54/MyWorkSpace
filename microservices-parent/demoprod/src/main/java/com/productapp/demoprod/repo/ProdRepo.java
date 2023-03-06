package com.productapp.demoprod.repo;

import com.productapp.demoprod.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProdRepo extends MongoRepository<Product,String> {


}
