package com.mistra.gateway.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Mistra
 * @ Version: 1.0
 * @ Time: 2021/5/7 下午7:52
 * @ Description: 网关白名单配置
 * @ Copyright (c) Mistra,All Rights Reserved.
 * @ Github: https://github.com/MistraR
 * @ CSDN: https://blog.csdn.net/axela30w
 */
@Data
@Component
@ConfigurationProperties(prefix = "secure.ignore")
public class IgnoreUrlsConfig {

    private List<String> urls;

}
