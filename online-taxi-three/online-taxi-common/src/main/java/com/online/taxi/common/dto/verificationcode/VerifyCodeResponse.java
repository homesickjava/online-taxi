package com.online.taxi.common.dto.verificationcode;
import lombok.Data;
/**
 * @author yueyi2019
 */
@Data
public class VerifyCodeResponse {
	
	private String code;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}