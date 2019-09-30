package cn.shuyiio.miniappsyma;

import cn.shuyiio.miniappsyma.spi.Robot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.ServiceLoader;

@SpringBootApplication
@EnableConfigurationProperties
public class MiniappSymaApplication {

	public static void main(String[] args) throws IOException {
		//SpringApplication.run(MiniappSymaApplication.class, args);

		ServiceLoader<Robot> robots = ServiceLoader.load(Robot.class);

		robots.forEach(Robot::sayHello);

		Enumeration<URL> urls = ClassLoader.getSystemResources("/Users/zhoushuyi/ideaProjects/syma/src/main/java/cn/shuyiio/miniappsyma/spi");


		while (urls.hasMoreElements()) {
			java.net.URL resourceURL = urls.nextElement();

			System.out.println(resourceURL.getFile());

		}

	}

}
