package com.zq;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet(name="HelloWorld",urlPatterns={"/Hello1","/Hello2","/hello"})	//servlet3.0新特性：标记，可以不配置web.xml的mapping
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorld() {
        super();
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("初始化完成>>>\n");
	}
	
	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();		
		out.print("<h1>hello world zq!</h1> + <br>"
				+ "request par1 = "
				+ request.getParameter("par1") + "<br>"
				+ "request par2 = "
				+ request.getParameter("par2") + "<br>");
		System.out.println(request.getCookies());
		System.out.println(request.getSession());
		System.out.println(request.getSession(true));
		System.out.println(request.getLocale());
		System.out.println(request.getMethod());
		System.out.println(request.getProtocol());
		System.out.println(request.getQueryString());
		System.out.println(request.getRequestURI());
		response.reset();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
