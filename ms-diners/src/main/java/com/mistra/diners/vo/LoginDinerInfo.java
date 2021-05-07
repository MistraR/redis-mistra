package com.mistra.diners.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author Mistra
 * @ Version: 1.0
 * @ Time: 2021/5/6 下午10:43
 * @ Description: 食客服务业务逻辑层
 * @ Copyright (c) Mistra,All Rights Reserved.
 * @ Github: https://github.com/MistraR
 * @ CSDN: https://blog.csdn.net/axela30w
 */
@Setter
@Getter
public class LoginDinerInfo implements Serializable {

    private String nickname;
    private String token;
    private String avatarUrl;

}