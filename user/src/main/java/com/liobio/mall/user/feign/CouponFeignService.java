package com.liobio.mall.user.feign;

import com.liobio.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author LIOBIO
 * @version 1.0.0
 * @ClassName CouponFeignService.java
 * @createTime 2021/08/31/17:07:00
 * @Description
 */

@FeignClient("liobiomall-coupon") //告诉spring cloud这个接口是一个远程客户端，要调用coupon服务(nacos中找到)，具体是调用coupon服务的/coupon/coupon/member/list对应的方法
public interface CouponFeignService {
    // 远程服务的url
    @RequestMapping("/coupon/smscoupon/member/list")//注意写全优惠券类上还有映射//注意我们这个地方不是控制层，所以这个请求映射请求的不是我们服务器上的东西，而是nacos注册中心的
    public R membercoupons();//得到一个R对象
}

