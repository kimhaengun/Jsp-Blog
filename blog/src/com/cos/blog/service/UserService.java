package com.cos.blog.service;

import com.cos.blog.domain.user.User;
import com.cos.blog.domain.user.dto.JoinReqDto;
import com.cos.blog.domain.user.dto.LoginReqDto;
import com.cos.blog.domain.user.dto.UpdateReqDto;

public class UserService {
	//회원가입, 로그인, 회원수정, 로그아웃, 아이디중복체크
	public int 회원가입(JoinReqDto dto) { //리턴 값이 int이기때문에 void 되신 리턴값 int
		
		return -1; //insert해주기 때문에 인트로 쓰면됨.
	}
	
	public User 로그인(LoginReqDto dto) {
		return null; // select이기 때문에 User에서 값 리턴
	}
	
	public int 회원수정(UpdateReqDto dto) {
		return -1; //update해주기 때문에 int
	} 
	
	public int 아이디중복체크(String username) { //username만 체크해주면됨
		return -1;
	}
}