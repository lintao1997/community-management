package online.exam.service;

import online.exam.entity.Product;
import online.exam.service.fallback.ProductServiceFallBack;
import online.exam.service.fallback.ProductServiceFallBackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//声明调用的提供者的name
//指定Feign接口容错后走的逻辑
@FeignClient(
        value = "service-product",
//        fallback = ProductServiceFallBack.class,
        fallbackFactory = ProductServiceFallBackFactory.class
//        **fallback和fallbackFactory只能使用一个
)
public interface ProductService {
    //指定调用提供者的哪个方法
    //@FeignClient+@GetMapping 就是一个完整的请求路径 http://serviceproduct/product/{pid}
    @GetMapping(value = "/product/{pid}")
    Product findById(@PathVariable("pid") Integer pid);


}
