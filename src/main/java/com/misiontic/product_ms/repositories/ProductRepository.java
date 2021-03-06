package com.misiontic.product_ms.repositories;

import com.misiontic.product_ms.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProductRepository extends MongoRepository <Product, String> {

      List<Product> findProductsByStoreId(String idStore);

}
