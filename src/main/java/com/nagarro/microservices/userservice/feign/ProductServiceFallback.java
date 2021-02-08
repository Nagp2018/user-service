package com.nagarro.microservices.userservice.feign;


import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;


import java.util.Arrays;
import java.util.List;

@Component
public class ProductServiceFallback implements ProductServiceProxy {

   /* @Override
    public List<Product> fetchProductsList() {
        return Arrays.asList(new Product());
    }*/

    @Override
    public Product getProduct(String productCode) {
        return new Product();
    }

    //commented as we don't want to call it in sync way
//    @Override
//    public Boolean updateStock(@RequestBody StockUpdateRequestDto stockUpdateRequestDto){
//     System.out.print("service is down hence returning false");
//     return false;
//    }
}
