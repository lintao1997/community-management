package online.exam.service.fallback;

import lombok.extern.slf4j.Slf4j;
import online.exam.entity.Product;
import online.exam.service.ProductService;
import org.springframework.stereotype.Service;

/**
 * 容错类
 */
@Service
@Slf4j
public class ProductServiceFallBack implements ProductService {
    @Override
    public Product findById(Integer pid) {
        Product product = new Product();
        product.setPid(-100);
        product.setPname("发生异常，进入了容错。");
        product.setPprice(-1.0);
        product.setStock(-1);
        return product;
    }
}
