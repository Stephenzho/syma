package cn.shuyiio.syma.consumer;

import org.apache.dubbo.config.annotation.Reference;
import cn.shuyiio.syma.DemoService;
import org.springframework.stereotype.Component;


@Component
public class DemoServiceComponent  {

    @Reference
    private DemoService demoService;

    public String sayHello(String name) {
        return demoService.sayHello(name);
    }
}
