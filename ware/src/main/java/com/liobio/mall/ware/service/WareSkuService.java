package com.liobio.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liobio.common.utils.PageUtils;
import com.liobio.mall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author liobio
 * @email 582437980@qq.com
 * @date 2021-08-29 15:59:51
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

