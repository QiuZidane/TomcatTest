package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletContext1
 */
@WebServlet("/ServletContext1")
public class ServletContext1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletContext1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		super.service(request, response);
		try {
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();			
			ServletContext context = this.getServletContext();
			String info = (String)context.getAttribute("myInfo");
			out.println("<br>从servletContext中得到属性myInfo对应的值为我是Zidane<br>");
			
			HttpSession session = request.getSession(true);
			String val = (String)session.getAttribute("test");
			out.println("session中的test="+val+"<br>");
			out.println("ServletContext1.URI = "+request.getRequestURI() + "<br>");	//
			
		} catch (Exception e) {
			e.printStackTrace();			
		}

		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ServletContex1-doGet");
		response.setCharacterEncoding("UTF-8");
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ServletContex1-doPost");
		response.setCharacterEncoding("UTF-8");
		doGet(request, response);
	}
	
	

}
