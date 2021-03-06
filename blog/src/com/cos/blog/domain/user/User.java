package com.cos.blog.domain.user;


import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class User {
	private int id;  //ID순서
	private String username; //유저네임
	private String password; //패스워드
	private String email; //이메일
	private String address; //주소
	//권한은 Enum으로 줘야함.  권한 -> 관리자 : admin, 사용자 : user
	private String userRole;
	private Timestamp createDate; //사용자 생성 시간
}
