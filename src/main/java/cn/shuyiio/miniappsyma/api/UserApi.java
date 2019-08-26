package cn.shuyiio.miniappsyma.api;

import cn.shuyiio.miniappsyma.config.properties.WxConfig;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserApi {

    private final WxConfig wxConfig;
    private final RestTemplate restTemplate;


    public UserApi(WxConfig wxConfig, RestTemplate restTemplate) {
        this.wxConfig = wxConfig;
        this.restTemplate = restTemplate;
    }


    @GetMapping("/id")
    public String getid(String code){

        // https://api.weixin.qq.com/sns/jscode2session?appid=%s&secret=%s&js_code=%s&grant_type=authorization_code
        String url = String.format(wxConfig.getCode2Session(), wxConfig.getAppid(), wxConfig.getSecret(), code);


        JSONObject res = restTemplate.getForObject(url, JSONObject.class, (Object) null);

        log.info(res.toJSONString());

        return res.toJSONString();

    }
}
