package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.jasper.tagplugins.jstl.core.Out;

import com.sun.org.apache.xalan.internal.xslt.Process;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet(description = "alloha", urlPatterns = { "/HelloServlet","/HelloServlet1" })
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service>>>");		
		
		 //业务逻辑  
		 try{  
		     //中文乱码  
//		     response.setContentType("text/html;charset=UTF-8");  
			 response.setContentType("text/html");
			 response.setCharacterEncoding("UTF-8");
		     PrintWriter pw=response.getWriter();  
		     pw.println("HelloServlet.URI = "+request.getRequestURI() + "<br>");
		     pw.println("HelloServlet.URL = "+request.getRequestURL() + "<br>");
		     //1.得到ServletContext  
		     ServletContext sc=this.getServletContext();  
		     //2.添加属性  
		     sc.setAttribute("myInfo","我是Zidane");  
		     pw.println("给servletContext中添加一个属性MyIinfo!!!<br>");  
		       
		     //比较session，添加属性  
		     HttpSession hs=request.getSession(true);  
		     hs.setAttribute("test","中国人");  
		     hs.setMaxInactiveInterval(60*3);  
		     pw.println("向session中添加一个test属性 他的值是中国人<br>");  
		       
		     		     response.setStatus(HttpServletResponse.SC_OK);
		     pw.println("status="+response.getStatus()+"<br>");  
		     

		     
		 }catch(Exception ex){  
		     ex.printStackTrace();  
		 }
		 
		 super.service(request, response);	// 父service内有自动调用doPost和doGet的方法，如果没有这句，则需要自己调用doPost和doGet
	}
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet>>>");
		response.setCharacterEncoding("GBK");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter().write("<br>HAPPY NEW YEAR!<br>");	
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/Servlet/HelloDispatcher1");	 //映射路径，这里servlet文件在根目录，直接写即可.简单说，跟annotation里面的一致即可
		rd.include(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost>>>");	
		response.setCharacterEncoding("GBK");
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter().write("This is doPost method<br>");
		doGet(request, response);
	}
	
	
	


}
