package cn.shuyiio.miniappsyma.config.properties;

import lombok.Data;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@Configuration
@ConfigurationProperties(prefix = "wx")
@Data
@Getter
public class WxConfig {

    private String appid;
    private String secret;
    private String code2Session;


}
