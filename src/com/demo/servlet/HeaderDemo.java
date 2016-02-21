package com.demo.servlet;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HeaderDemo
 */
@WebServlet("/HeaderDemo")
public class HeaderDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HeaderDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

    
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
		super.service(request, response);
		
		 response.setContentType("text/html");
		 response.setCharacterEncoding("UTF-8");
		
	     //重定向方法1：设置状态码302+Header的Loaction字段设置url
//	     response.setHeader("Location", "http://baidu.com");
//	     response.setStatus(302);
	     
	     //name不区分大小写，
	     response.addHeader("HEADERNAMEQQQQQ", "VALUEQQQQQ");
	     response.setHeader("HEADERNAMEQQQQq", "QQQQ");
//	     response.setHeader("content-type", "image/jpeg");
	     
	     //设置大小，通常servlet引擎会自动计算
//	     response.setContentLength(1234);
	     
	     
	     //重定向方法2：使用sendRedirect方法
//	     response.sendRedirect("https://baidu.com");
//	     response.sendRedirect("./image/which.jpg");
	     
	     //请求错误400~499 500~599
//	     response.sendError(501,"发生错误");	     
	     
	     System.out.println(response.containsHeader("headernameqqqqq"));	//true
	     
	     Calendar calendar = Calendar.getInstance();
	     calendar.set(2016, 1, 21, 17, 37, 10);
	     response.addDateHeader("mydate", calendar.getTimeInMillis());
	     
	     
	     

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
