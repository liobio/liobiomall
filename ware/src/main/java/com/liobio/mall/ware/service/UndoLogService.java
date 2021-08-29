package com.liobio.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liobio.common.utils.PageUtils;
import com.liobio.mall.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author liobio
 * @email 582437980@qq.com
 * @date 2021-08-29 15:59:51
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

