package online.exam.service.fallback;

import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import online.exam.entity.Product;
import online.exam.service.ProductService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProductServiceFallBackFactory implements
        FallbackFactory<ProductService> {
    @Override
    public ProductService create(Throwable throwable) {
        return new ProductService() {
            @Override
            public Product findById(Integer pid) {
                throwable.printStackTrace();
                log.error("{}",pid);
                Product product = new Product();
                product.setPid(-100);
                product.setPname("发生异常，进入了容错。");
                product.setPprice(-1.0);
                product.setStock(-1);
                return product;
            }
        };
    }
}