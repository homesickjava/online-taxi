package com.mashibing.apipassenger.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.online.taxi.common.dto.ResponseResult;
import com.online.taxi.common.dto.order.ForecastRequest;
import com.online.taxi.common.dto.order.ForecastResponse;

/**
 * 
 * @author yueyi2019
 *
 */
//@FeignClient(name = "service-valuation",configuration = FeignAuthConfiguration.class)
@FeignClient(name = "service-valuation")
public interface ServiceForecast {
	
	@RequestMapping(value = "/forecast/single",method = RequestMethod.POST)
	public ResponseResult<ForecastResponse> forecast(@RequestBody ForecastRequest forecastRequest);
	
}
