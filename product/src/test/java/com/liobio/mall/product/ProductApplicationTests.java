package com.liobio.mall.product;

import com.liobio.mall.product.entity.BrandEntity;
import com.liobio.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductApplicationTests {

    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {


    }

}
