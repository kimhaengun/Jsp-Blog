package com.cos.ajax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

@WebServlet("/ajax2")
public class Ajax2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Ajax2() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BufferedReader br = request.getReader(); // http body 데이터 순수하게 읽기
		String requestData = br.readLine();
		System.out.println(requestData);
		
		Gson gson = new Gson();
		// gson.fromJson() => json을 자바 오브젝트로
		// gson.toJson() => 자바 오브젝트를 json으로 
		UserDto userDto = gson.fromJson(requestData, UserDto.class);
		
		System.out.println(userDto);
		
		User user = new User();
		user.setId(1);
		user.setUsername("love");
		user.setPassword("1234");
		user.setPhone("0102222");
		
		String userJson = gson.toJson(user);
		System.out.println("userJson : "+userJson);
		response.setContentType("application/json; chatset=utf-8");
		PrintWriter out  = response.getWriter();
		out.print(userJson);
		out.flush();
	}
}
