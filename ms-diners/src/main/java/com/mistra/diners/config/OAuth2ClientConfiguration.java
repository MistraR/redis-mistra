package com.mistra.diners.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Mistra
 * @ Version: 1.0
 * @ Time: 2021/5/6 下午10:21
 * @ Description: 客户端配置类
 * @ Copyright (c) Mistra,All Rights Reserved.
 * @ Github: https://github.com/MistraR
 * @ CSDN: https://blog.csdn.net/axela30w
 */
@Component
@ConfigurationProperties(prefix = "oauth2.client")
@Getter
@Setter
public class OAuth2ClientConfiguration {

    private String clientId;
    private String secret;
    private String grant_type;
    private String scope;
}