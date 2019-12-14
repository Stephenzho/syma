package cn.shuyiio.syma.consumer;

import cn.shuyiio.syma.DemoService;
import cn.shuyiio.syma.consumer.unit.SpringContextUnit;
import org.apache.dubbo.common.utils.Assert;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ConsumerApplication {



    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);


        // test
        ApplicationContext context = SpringContextUnit.getApplicationContext();

        DemoService demoService = context.getBean(DemoService.class);

        Assert.notNull(demoService, "没有");

        System.out.println(demoService.sayHello("123"));

    }

}
