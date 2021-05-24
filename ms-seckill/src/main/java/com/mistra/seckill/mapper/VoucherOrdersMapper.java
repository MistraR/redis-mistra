package com.mistra.seckill.mapper;

import com.mistra.commons.model.pojo.VoucherOrders;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author Mistra
 * @ Version: 1.0
 * @ Time: 2021/5/7 下午9:01
 * @ Description: 代金券订单 Mapper
 * @ Copyright (c) Mistra,All Rights Reserved.
 * @ Github: https://github.com/MistraR
 * @ CSDN: https://blog.csdn.net/axela30w
 */
public interface VoucherOrdersMapper {

    // 根据食客 ID 和秒杀 ID 查询代金券订单
    @Select("select id, order_no, fk_voucher_id, fk_diner_id, qrcode, payment," +
            " status, fk_seckill_id, order_type, create_date, update_date, " +
            " is_valid from t_voucher_orders where fk_diner_id = #{dinerId} " +
            " and fk_voucher_id = #{voucherId} and is_valid = 1 and status between 0 and 1 ")
    VoucherOrders findDinerOrder(@Param("dinerId") Integer dinerId,
                                 @Param("voucherId") Integer voucherId);

    // 新增代金券订单
    @Insert("insert into t_voucher_orders (order_no, fk_voucher_id, fk_diner_id, " +
            " status, fk_seckill_id, order_type, create_date, update_date,  is_valid)" +
            " values (#{orderNo}, #{fkVoucherId}, #{fkDinerId}, #{status}, #{fkSeckillId}, " +
            " #{orderType}, now(), now(), 1)")
    int save(VoucherOrders voucherOrders);

}