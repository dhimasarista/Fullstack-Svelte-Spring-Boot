package com.belajar.java;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatProtocolHandlerCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class JavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaApplication.class, args);
    }

    @RequestMapping(value = { "/", "/{[path:[^\\.]*}" })
    public String fallback() {
        return "forward:/index.html";
    }

    @Bean
    public Executor applicationExecutor() {
        return Executors.newVirtualThreadPerTaskExecutor();
    }

    @Bean
    public TomcatProtocolHandlerCustomizer<
        ?
    > tomcatProtocolHandlerCustomizer() {
        return handler -> {
            handler.setExecutor(applicationExecutor());
        };
    }
}
