package com.mashibing.apipassenger.request;

import lombok.Data;

@Data
public class UserAuthRequest {
	
	private String phoneNumber;
	
	private String code;
}
