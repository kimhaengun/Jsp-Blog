package com.cos.blog.domain.user.dto;

import lombok.Data;

@Data
public class UpdateReqDto { //회원수정 dto
	private String password;
	private String email;
	private String address;
}
