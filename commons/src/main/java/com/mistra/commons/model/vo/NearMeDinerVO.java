package com.mistra.commons.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Mistra
 * @ Version: 1.0
 * @ Time: 2021/5/6 下午10:43
 * @ Description:
 * @ Copyright (c) Mistra,All Rights Reserved.
 * @ Github: https://github.com/MistraR
 * @ CSDN: https://blog.csdn.net/axela30w
 */
@ApiModel(description = "附近的人")
@Getter
@Setter
public class NearMeDinerVO extends ShortDinerInfo {

    @ApiModelProperty(value = "距离", example = "98m")
    private String distance;

}