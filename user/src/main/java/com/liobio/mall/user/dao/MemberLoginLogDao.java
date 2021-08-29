package com.liobio.mall.user.dao;

import com.liobio.mall.user.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author liobio
 * @email 582437980@qq.com
 * @date 2021-08-29 15:21:21
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
