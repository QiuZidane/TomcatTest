package com.zq;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckBox
 */
@WebServlet("/CheckBox")
public class CheckBox extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		System.out.println("初始化checkbox完成");
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckBox() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath()).append("\n");
//		Enumeration<String> paramNames = request.getParameterNames();	
//		while (paramNames.hasMoreElements()) {
//			String string = (String) paramNames.nextElement();
//			System.out.println(string);
//			
//		}
		doPost(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		PrintWriter out =  response.getWriter();	
		
		Enumeration<String> paramNames = request.getParameterNames();	
		while(paramNames.hasMoreElements()) {
			String paramName = (String)paramNames.nextElement();
			out.print("paramName = " + paramName + "\n");
			String[] paramValues = request.getParameterValues(paramName);
			out.print(paramValues[0]);
				
		}		
//		while (paramNames.hasMoreElements()) {
//			String param = (String) paramNames.nextElement();
//			String paramValues[] = request.getParameterValues(param);
//			if (paramValues.length > 1) {
//				out.println(param + "==" + paramValues[0] + "\n");
//				out.println(param + "==" + paramValues[1] + "\n");				
//			}else {
//				out.println(param + "=" + paramValues[0] + "\n");
//			}
//			System.out.println(param);
//		}
////		String maths = request.getParameter("maths");
////		out.print("maths = " + maths);
		
	}

}
