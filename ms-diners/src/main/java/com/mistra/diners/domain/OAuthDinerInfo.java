package com.mistra.diners.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * @author Mistra
 * @ Version: 1.0
 * @ Time: 2021/5/6 下午10:43
 * @ Description: 食客服务业务逻辑层
 * @ Copyright (c) Mistra,All Rights Reserved.
 * @ Github: https://github.com/MistraR
 * @ CSDN: https://blog.csdn.net/axela30w
 */
@Getter
@Setter
public class OAuthDinerInfo implements Serializable {

    private String nickname;
    private String avatarUrl;
    private String accessToken;
    private String expireIn;
    private List<String> scopes;
    private String refreshToken;

}