package cn.shuyiio.syma.provider.config;


import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableDubbo(scanBasePackages = "cn.shuyiio.syma.provider")
public class DubboConfig {


}
