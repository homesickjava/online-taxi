package com.mashibing.apipassenger.feign;

import com.mashibing.apipassenger.fallback.SmsClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.online.taxi.common.dto.ResponseResult;
import com.online.taxi.common.dto.sms.SmsSendRequest;

/**
 * @author yueyi2019
 */


//@FeignClient(name = "service-sms",configuration = FeignDisableHystrixConfiguration.class)
//@FeignClient(name = "service-sms",fallbackFactory = SmsClientFallbackFactory.class)
@FeignClient(name = "service-sms",fallback = SmsClientFallback.class)
//@FeignClient(name = "service-sms")
public interface SmsClient {
	/**
	 * 按照短信模板发送验证码
	 * @param smsSendRequest
	 * @return
	 */
	@RequestMapping(value="/send/alisms-template", method = RequestMethod.POST)
	public ResponseResult sendSms(@RequestBody SmsSendRequest smsSendRequest);
}
