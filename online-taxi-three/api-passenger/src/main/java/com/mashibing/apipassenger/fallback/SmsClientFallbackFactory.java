package com.mashibing.apipassenger.fallback;

import com.mashibing.apipassenger.feign.SmsClient;
import org.springframework.stereotype.Component;

import com.online.taxi.common.dto.ResponseResult;
import com.online.taxi.common.dto.sms.SmsSendRequest;

import feign.hystrix.FallbackFactory;

@Component
public class SmsClientFallbackFactory implements FallbackFactory<SmsClient> {

	@Override
	public SmsClient create(Throwable cause) {
		return new SmsClient() {
			
			@Override
			public ResponseResult sendSms(SmsSendRequest smsSendRequest) {
				System.out.println("feign异常："+cause);
				return ResponseResult.fail(-3, "feign fallback factory熔断");
			}
		};
	}

}
