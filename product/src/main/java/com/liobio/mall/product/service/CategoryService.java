package com.liobio.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liobio.common.utils.PageUtils;
import com.liobio.mall.product.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author liobio
 * @email 582437980@qq.com
 * @date 2021-08-27 22:11:50
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

