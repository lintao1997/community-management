package online.exam.service.impl;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import online.exam.dao.OrderDao;
import online.exam.entity.Order;
import online.exam.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;

    @Override
    public void save(Order order) {
        orderDao.save(order);
    }

    @SentinelResource(value = "m1",
            blockHandlerClass = OrderServiceImpl3BlockHandlerClass.class,
            blockHandler = "blockHandler",
            fallbackClass = OrderServiceImpl3FallbackClass.class,
            fallback = "fallback")
    @Override
    public void m1() {
        System.out.println("m1");
    }

}
