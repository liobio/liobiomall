package com.liobio.mall.order.dao;

import com.liobio.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author liobio
 * @email 582437980@qq.com
 * @date 2021-08-29 15:53:36
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
