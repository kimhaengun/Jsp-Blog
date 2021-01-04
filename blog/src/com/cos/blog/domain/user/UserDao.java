package com.cos.blog.domain.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cos.blog.config.DB;
import com.cos.blog.domain.user.dto.JoinReqDto;

public class UserDao {
	public int findByUsername(String username) {
		String sql = "SELECT * FROM user WHERE username = ?";
		Connection conn = DB.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, username);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				return 1; //중복 있어
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally { //무조건 실행 하기
			DB.close(conn, pstmt, rs);
		}
		return -1; //중복 없어
	}
	
	public int save(JoinReqDto dto) { //회원가입
		String sql = "INSERT INTO user(username, password, email, address, userRole, createDate) VALUES(?,?,?,?, 'USER', now())";
		Connection conn = DB.getConnection();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getUsername());
			pstmt.setString(2, dto.getPassword());
			pstmt.setString(3, dto.getEmail());
			pstmt.setString(4, dto.getAddress());
			int result = pstmt.executeUpdate();
			return result;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally { //무조건 실행 하기
			DB.close(conn, pstmt);
		}
		return -1;
	}
	public void update() { //회원수정
		
	}
	public void usernameCheck() { //아이디 중복체크
		
	}
	public void findById() { //회원정보 보기 
		
	}
}
