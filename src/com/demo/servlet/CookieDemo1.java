package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieDemo1
 */
@WebServlet("/CookieDemo1")
public class CookieDemo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookieDemo1() {
        super();
        // TODO Auto-generated constructor stub
    }

    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	super.service(request, response);
    	response.setContentType("text/html; charset=UTF-8");
    	PrintWriter out = response.getWriter();
    	
    	//设置临时cookie，不设置MaxAge属性
    	Cookie tempcookie = new Cookie("temp", "1111111");
    	
    	//添加到response中
    	response.addCookie(tempcookie);
    	
    	Cookie cookie = new Cookie("cookie", "666666");
    	
    	//有效时间为0秒，浏览器接收后会立刻删除
    	cookie.setMaxAge(0);
    	
    	response.addCookie(tempcookie);
    	
    	//获得请求参数user的值
    	String user = request.getParameter("user");
    	
    	if (user!=null) {
			//建立有效时间=1天的Cookie对象
    		Cookie usercookie = new Cookie("user", user);
    		usercookie.setMaxAge(60*60*24);
    		//对这个站点所有目录有效="/"，不设置则只对当前Servlet有效
    		usercookie.setPath("/");
    		response.addCookie(usercookie);    		
		}
    	
    	//转发到HelloDispatcher1
    	RequestDispatcher rDispatcher = getServletContext().getRequestDispatcher("/Servlet/HelloDispatcher1");
    	rDispatcher.include(request, response);
    	
    
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
