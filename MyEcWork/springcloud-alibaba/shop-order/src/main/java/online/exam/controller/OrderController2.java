package online.exam.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import online.exam.entity.Order;
import online.exam.entity.Product;
import online.exam.service.OrderService;
import online.exam.service.ProductService;
import online.exam.service.impl.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class OrderController2 {

    @Autowired
    private OrderServiceImpl orderServiceImpl;


    @RequestMapping("/order/message1")
    public String message1() {
        orderServiceImpl.m1();
        return "message1";
    }
    @RequestMapping("/order/message3")
    @SentinelResource("message3")//注意这里必须使用这个注解标识,热点规则不生效
    public String message3(String name, Integer age) {
        return name + age;
    }
//
//    int i = 0;
//    @SentinelResource(
//            value = "message",
//            blockHandler = "blockHandler",//指定发生BlockException时进入的方法
//            fallback = "fallback"//指定发生Throwable时进入的方法
////            方式二: 将限流和降级方法外置到单独的类中
//    )
//    public String message() {
//        i++;
//        if (i % 3 == 0) {
//            throw new RuntimeException();
//        }
//        return "message";
//    }
//    //BlockException时进入的方法
//    public String blockHandler(BlockException ex) {
//        log.error("{}", ex);
//        return "接口被限流或者降级了...";
//    }
//    //Throwable时进入的方法
//    public String fallback(Throwable throwable) {
//        log.error("{}", throwable);
//        return "接口发生异常了...";
//    }



}

