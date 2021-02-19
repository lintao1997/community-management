package gks.lcf.com.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import gks.lcf.com.interceptor.LoginInterceptor;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer{
    @Autowired
    private LoginInterceptor loginInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
    	System.out.println("addInterceptors...");
        // 添加一个拦截器，拦截以/admin为前缀的url路径
        registry.addInterceptor(loginInterceptor).addPathPatterns("/").excludePathPatterns("/user/toLogin").excludePathPatterns("/css/**","/js/**","/images/**","/plugins/**");
//        registry.addInterceptor(loginInterceptor).addPathPatterns("/**").excludePathPatterns("/admin/login").excludePathPatterns("/admin/dist/**").excludePathPatterns("/admin/plugins/**");
    }
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/upload/**").addResourceLocations("file:" + Constants.FILE_UPLOAD_DIC);
//    }
}
