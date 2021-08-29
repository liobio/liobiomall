package com.liobio.mall.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liobio.common.utils.PageUtils;
import com.liobio.mall.user.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author liobio
 * @email 582437980@qq.com
 * @date 2021-08-29 15:21:21
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

