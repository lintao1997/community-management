package online.exam.controller;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import online.exam.entity.Order;
import online.exam.entity.Product;
import online.exam.service.OrderService;
import online.exam.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderController {
//    @Autowired
//    private RestTemplate restTemplate;
    @Autowired
    private OrderService orderService;
//    @Autowired
//    private DiscoveryClient discoveryClient;
    @Resource
    private ProductService productService;
    //准备买1件商品
    @GetMapping("/order/prod/{pid}")
    public Order order(@PathVariable("pid") Integer pid) {
        log.info(">>客户下单，这时候要调用商品微服务查询商品信息");
        //从nacos中获取服务地址
//        ServiceInstance serviceInstance = discoveryClient.getInstances("service-product").get(0);
////        String url = serviceInstance.getHost()+":"+serviceInstance.getPort();
//        String url = "service-product";
//
//        log.info(">>从nacos中获取到的微服务地址为:" + url);
//
//        //通过restTemplate调用商品微服务
////        Product product = restTemplate.getForObject(
////                "http://" + url + "/product/" + pid, Product.class);
//
//        Product product = restTemplate.getForObject("http://"+url+"/product/"+pid,Product.class);
        Product product = productService.findById(pid);
        //模拟一次网络延时
        if(product.getPid()<1){
            Order order = new Order();
            order.setPid(product.getPid());
            order.setPname("下单失败.");
            return order;
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info(">>商品信息,查询结果:" + JSON.toJSONString(product));
        Order order = new Order();
        order.setUid(1);
        order.setUsername("测试用户");
        order.setPid(product.getPid());

        order.setPname(product.getPname());
        order.setPprice(product.getPprice());
        order.setNumber(1);
        log.info("创建订单成功,订单信息为{}", JSON.toJSONString(order));
        return order;
    }
}