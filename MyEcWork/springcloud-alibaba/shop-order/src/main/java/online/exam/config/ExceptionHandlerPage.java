package online.exam.config;

import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.BlockExceptionHandler;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.authority.AuthorityException;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeException;
import com.alibaba.csp.sentinel.slots.block.flow.FlowException;
import com.alibaba.csp.sentinel.slots.block.flow.param.ParamFlowException;
import com.alibaba.csp.sentinel.slots.system.SystemBlockException;
import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.MalformedURLException;

/**
 * 自定义sentinel异常返回信息
 */
@Component
public class ExceptionHandlerPage implements BlockExceptionHandler {
    //BlockException 异常接口,包含Sentinel的五个异常 4.7 @SentinelResource的使用 在定义了资源点之后，我们可以通过Dashboard来设置限流和降级策略来对资源点进行保护。同时还能 通过@SentinelResource来指定出现异常时的处理策略。 @SentinelResource 用于定义资源，并提供可选的异常处理和 fallback 配置项。其主要参数如下: // FlowException 限流异常 // DegradeException 降级异常 // ParamFlowException 参数限流异常 // AuthorityException 授权异常 // SystemBlockException 系统负载异常
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, BlockException ex) throws Exception {
        response.setContentType("application/json;charset=utf-8");
        String msg = null;
        if (ex instanceof FlowException) {
            msg = "FlowException 限流了";
        } else if (ex instanceof DegradeException) {
            msg = "DegradeException 降级了";
        } else if (ex instanceof ParamFlowException) {
            msg = "ParamFlowException 热点参数限流";
        } else if (ex instanceof SystemBlockException) {
            msg = "SystemBlockException 系统规则（负载/...不满足要求）";
        } else if (ex instanceof AuthorityException) {
            msg = "AuthorityException 授权规则不通过";
        }
        // http状态码
        response.setStatus(500);
        response.setCharacterEncoding("utf-8");
        response.setHeader("Content-Type", "application/json;charset=utf-8");
        response.setContentType("application/json;charset=utf-8");
        // spring mvc自带的json操作工具，叫jackson
        response.getWriter().write(JSON.toJSONString(msg));
    }
}

@Data
@AllArgsConstructor//全参构造
@NoArgsConstructor
//无参构造
class ResponseData {
    private int code;
    private String message;
}