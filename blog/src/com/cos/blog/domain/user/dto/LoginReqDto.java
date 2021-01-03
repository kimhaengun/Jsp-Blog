package com.cos.blog.domain.user.dto;

import lombok.Data;

@Data
public class LoginReqDto { //로그인 dto
	private String username;
	private String password;

	
}
