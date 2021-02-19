package online.exam.config;

import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.RequestOriginParser;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class RequestOriginParserDefinition implements RequestOriginParser {
    /**
     * 其实这个位置要填写的是来源标识，Sentinel提供了RequestOriginParser 接口来处理来源。
     * 只要Sentinel保护的接口资源被访问，Sentinel就会调用RequestOriginParser 的实现类去解析访问来源。
     */
    @Override
    public String parseOrigin(HttpServletRequest request) {
        String serviceName = request.getParameter("serviceName");
        return serviceName;
    }
}
