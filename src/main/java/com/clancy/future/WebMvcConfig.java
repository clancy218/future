package com.clancy.future;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * The beauty of Java programming
 *
 * @Auther: clancy
 * @Date: 2022/03/29  13:39
 * @Name: WebMvcConfig
 * @Version: v1.0
 * @Description:
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        if(!registry.hasMappingForPattern("/static/**")){
            registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/**");
        }
        super.addResourceHandlers(registry);
    }
}
