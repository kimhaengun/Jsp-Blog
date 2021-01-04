package com.cos.blog.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ajax")
public class AjaxTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public AjaxTest() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//데이터 응답
		PrintWriter out = response.getWriter();
		out.print("ok");
		//println은 역슬러쉬(내려쓰기)가 붙어있기 때문에 print로 해야함
		out.flush();
	}

}
