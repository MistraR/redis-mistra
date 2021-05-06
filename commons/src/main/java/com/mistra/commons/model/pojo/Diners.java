package com.mistra.commons.model.pojo;

import com.mistra.commons.model.base.BaseModel;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Mistra
 * @ Version: 1.0
 * @ Time: 2021/5/6 下午10:12
 * @ Description: 食客实体类
 * @ Copyright (c) Mistra,All Rights Reserved.
 * @ Github: https://github.com/MistraR
 * @ CSDN: https://blog.csdn.net/axela30w
 */
@Getter
@Setter
public class Diners extends BaseModel {

    // 主键
    private Integer id;
    // 用户名
    private String username;
    // 昵称
    private String nickname;
    // 密码
    private String password;
    // 手机号
    private String phone;
    // 邮箱
    private String email;
    // 头像
    private String avatarUrl;
    // 角色
    private String roles;

}
