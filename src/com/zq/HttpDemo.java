package com.zq;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

import com.sun.jmx.snmp.Enumerated;

/**
 * Servlet implementation class HttpDemo
 */
@WebServlet(
		asyncSupported = true, 
		urlPatterns = { 
				"/HttpDemo", 
				"/HD"
		})
public class HttpDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HttpDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		Enumeration headerNames = request.getHeaderNames();
		PrintWriter out = response.getWriter();
		while (headerNames.hasMoreElements()) {
			String header = (String) headerNames.nextElement();
			String headerValue = request.getHeader(header);
			out.print(header+"="+headerValue+"\n");
		}
//		response.setIntHeader("Refresh", 2);
//		response.sendRedirect("http://baidu.com");
		Throwable throwable = (Throwable)request.getAttribute("javax.servlet.error.exception");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
