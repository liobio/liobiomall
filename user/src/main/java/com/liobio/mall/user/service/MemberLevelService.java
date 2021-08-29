package com.liobio.mall.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liobio.common.utils.PageUtils;
import com.liobio.mall.user.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author liobio
 * @email 582437980@qq.com
 * @date 2021-08-29 15:21:21
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

