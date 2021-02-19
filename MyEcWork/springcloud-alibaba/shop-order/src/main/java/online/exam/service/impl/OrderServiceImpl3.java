package online.exam.service.impl;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OrderServiceImpl3 {
    int i = 0;
    @SentinelResource(
            value = "message",
            blockHandlerClass = OrderServiceImpl3BlockHandlerClass.class,
            blockHandler = "blockHandler",
            fallbackClass = OrderServiceImpl3FallbackClass.class,
            fallback = "fallback"
    )
    public String message() {
        i++;
        if (i % 3 == 0) {
            throw new RuntimeException();
        }
        return "message4";
    }
}