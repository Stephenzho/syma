package cn.shuyiio.syma.consumer.config;


import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableDubbo(scanBasePackages = "cn.shuyiio.syma.consumer")
public class DubboConfig {
}
