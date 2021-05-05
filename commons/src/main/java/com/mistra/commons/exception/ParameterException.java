package com.mistra.commons.exception;

import com.mistra.commons.constant.ApiConstant;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Mistra
 * @ Version: 1.0
 * @ Time: 2021/5/5 下午10:31
 * @ Description: 全局异常类
 * @ Copyright (c) Mistra,All Rights Reserved.
 * @ Github: https://github.com/MistraR
 * @ CSDN: https://blog.csdn.net/axela30w
 */
@Getter
@Setter
public class ParameterException extends RuntimeException {

    private Integer errorCode;

    public ParameterException() {
        super(ApiConstant.ERROR_MESSAGE);
        this.errorCode = ApiConstant.ERROR_CODE;
    }

    public ParameterException(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public ParameterException(String message) {
        super(message);
        this.errorCode = ApiConstant.ERROR_CODE;
    }

    public ParameterException(Integer errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

}
