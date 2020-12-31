package com.cos.blog.domain.board;

import java.security.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Board {
	private int id;
	private int userId; //userTbl id
	private String title; // 타이틀 제목
	private String content; //내용
	private int readCount; // 조회수 초기 디폴트값 = 0
	private Timestamp createDate;
}
