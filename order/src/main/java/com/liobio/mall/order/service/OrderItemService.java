package com.liobio.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liobio.common.utils.PageUtils;
import com.liobio.mall.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author liobio
 * @email 582437980@qq.com
 * @date 2021-08-29 15:53:36
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

