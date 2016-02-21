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
@WebServlet(
		name="HelloWorld",
		urlPatterns={"/Hello1","/Hello2","/hello"})	//servlet3.0新特性：标记，可以不配置web.xml的mapping
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorld() {
        super();
    }
    
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	super.service(req, resp);
//    	PrintWriter out = resp.getWriter();
//    	out.print("2222");
//    	out.print("<br>getRemoteAddr="+req.getRemoteAddr()+"<br>");
//    	out.print("<br>getRemoteHost="+req.getRemoteHost()+"<br>");
//    	out.print("<br>getRemotePort="+req.getRemotePort()+"<br>");
//    	out.print("<br>getLocalAddr="+req.getLocalAddr()+"<br>");
//    	out.print("<br>getLocalName="+req.getLocalName()+"<br>");
//    	out.print("<br>getLocalPort="+req.getLocalPort()+"<br>");

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
		System.out.println("getCookies="+request.getCookies());
		System.out.println("getSession="+request.getSession());
		System.out.println("getSession(true)="+request.getSession(true));
		System.out.println("getLocale="+request.getLocale());
		System.out.println("getMethod="+request.getMethod());
		System.out.println("getProtocol="+request.getProtocol());
		System.out.println("getQueryString="+request.getQueryString());
		System.out.println("getRequestURI="+request.getRequestURI());
    	System.out.println("getServletPath="+request.getServletPath());
    	System.out.println("getContextPath="+request.getContextPath());
    	System.out.println("getServletContext="+request.getServletContext());
    	
    	out.print("1234");
    	out.print("<br>getRemoteAddr="+request.getRemoteAddr()+"<br>");
    	out.print("<br>getRemoteHost="+request.getRemoteHost()+"<br>");
    	out.print("<br>getRemotePort="+request.getRemotePort()+"<br>");
    	out.print("<br>getLocalAddr="+request.getLocalAddr()+"<br>");
    	out.print("<br>getLocalName="+request.getLocalName()+"<br>");
    	out.print("<br>getLocalPort="+request.getLocalPort()+"<br>");
    	
    	
		
//		response.reset();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
