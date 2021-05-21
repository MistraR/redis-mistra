package com.mistra.seckill.controller;

import com.mistra.commons.model.domain.ResultInfo;
import com.mistra.commons.model.pojo.SeckillVouchers;
import com.mistra.commons.utils.ResultInfoUtil;
import com.mistra.seckill.service.SeckillService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author Mistra
 * @ Version: 1.0
 * @ Time: 2021/5/7 下午9:01
 * @ Description: 秒杀控制层
 * @ Copyright (c) Mistra,All Rights Reserved.
 * @ Github: https://github.com/MistraR
 * @ CSDN: https://blog.csdn.net/axela30w
 */
@RestController
public class SeckillController {

    @Resource
    private SeckillService seckillService;
    @Resource
    private HttpServletRequest request;

    /**
     * 秒杀下单
     *
     * @param voucherId
     * @param access_token
     * @return
     */
    @PostMapping("{voucherId}")
    public ResultInfo<String> doSeckill(@PathVariable Integer voucherId, String access_token) {
        ResultInfo resultInfo = seckillService.doSeckill(voucherId, access_token, request.getServletPath());
        return resultInfo;
    }

    /**
     * 新增秒杀活动
     *
     * @param seckillVouchers
     * @return
     */
    @PostMapping("add")
    public ResultInfo<String> addSeckillVouchers(@RequestBody SeckillVouchers seckillVouchers) {
        seckillService.addSeckillVouchers(seckillVouchers);
        return ResultInfoUtil.buildSuccess(request.getServletPath(),
                "添加成功");
    }

}