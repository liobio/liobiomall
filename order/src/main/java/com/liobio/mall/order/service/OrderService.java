package com.liobio.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liobio.common.utils.PageUtils;
import com.liobio.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author liobio
 * @email 582437980@qq.com
 * @date 2021-08-29 15:53:36
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

