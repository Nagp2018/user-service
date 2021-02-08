package com.nagarro.microservices.userservice.feign;




import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Component
@FeignClient(name = "product-service", url = "http://localhost:9010/api"
        , fallback = ProductServiceFallback.class)
public interface ProductServiceProxy {
    //@GetMapping("/products")

    /*@RequestMapping(method = RequestMethod.GET, value = "/product/", consumes = "application/json")
    public List<Product> fetchProductsList();*/


    @RequestMapping(method = RequestMethod.GET, value = "/{productCode}", consumes = "application/json")
    public Product getProduct(@PathVariable(value = "productCode") String productCode);

    // commented as we don't want to call it in sync way.
//    @RequestMapping(method = RequestMethod.PUT, value = "/product/inventory", consumes = "application/json")
//    Boolean updateStock(@RequestBody StockUpdateRequestDto stockUpdateRequestDto);

}
