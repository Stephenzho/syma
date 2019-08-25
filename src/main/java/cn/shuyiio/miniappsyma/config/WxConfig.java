package cn.shuyiio.miniappsyma.config;

import lombok.Data;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Configurable
@ConfigurationProperties(prefix = "wx")
@Data
@Getter
public class WxConfig {

    private String appid;
    private String secret;
    private String code2Session;


}
