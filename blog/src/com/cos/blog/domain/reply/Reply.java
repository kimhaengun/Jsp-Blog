package com.cos.blog.domain.reply;

import java.security.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Reply {
	private int id; //id
	private int userId; //userTbl id
	private int boardId; //boardTbl id
	private String content; 
	private Timestamp createDate;
}
