package com.online.taxi.common.dto.sms;

import java.util.Map;

import lombok.Data;
/**
 * @author yueyi2019
 */
@Data
public class SmsTemplateDto {

	private String id;

	private Map<String, Object> templateMap;

	@Override
	public String toString() {
		return "SmsTemplateDto [id=" + id + ", templateMap=" + templateMap + "]";
	}

}