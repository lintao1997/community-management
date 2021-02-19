package online.exam.service;

import online.exam.entity.Product;
import org.springframework.stereotype.Service;

public interface ProductService {
    Product findByPid(Integer pid);
}
