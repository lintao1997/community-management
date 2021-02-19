package online.exam.controller;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import online.exam.entity.Product;
import online.exam.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping("/product/{pid}")
    public Product product(@PathVariable("pid") Integer pid) {
        Product product = productService.findByPid(pid);
        log.info("查询到商品:" + JSON.toJSONString(product));
        return product;
    }
}