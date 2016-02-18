package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ForwardServlet1
 */
@WebServlet({ "/ForwardServlet1", "/FS" })
public class ForwardServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ForwardServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	super.service(request, response);
    	response.setContentType("text/html;charset=UTF-8");
//    	RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/ServletContext1");
//    	rd.forward(request, response);
    	
//    	PrintWriter out = response.getWriter();
//    	out.println("ForwardServlet>>>>.URI = "+request.getRequestURI() + "<br>");
//    	out.println("ForwardServlet<<<<.URI = "+request.getRequestURI() + "<br>");
    	
    }
    


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			System.out.println("ForwardServlet1-doGet");
			response.setCharacterEncoding("UTF-8");
			response.getWriter().append("Served at: ").append(request.getContextPath());	
			PrintWriter out = response.getWriter();		
	    	out.println("<br>ForwardServlet>>>>.URI = "+request.getRequestURI() + "<br>");
	    	
	    	
	    	// 如果使用forward转发，则本servlet的输出(out.println)将会被清空，只输出转发servlet的内容。
	    	// 在forward转发前，将缓冲区数据输出(How?)，则forward方法会抛出异常IllegalStateException，但浏览器还是会正常输出
	    	RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/ServletContext1");
	    	RequestDispatcher rd2 = this.getServletContext().getRequestDispatcher("/HelloServlet");
	    	rd2.forward(request, response);	
		} catch (Exception e) {
			// TODO: handle exception
		}

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ForwardServlet1-doPost");
		response.setCharacterEncoding("UTF-8");
		doGet(request, response);
		
	}

}
