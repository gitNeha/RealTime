package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class LCTestServlet extends HttpServlet {
	static {
		System.out.println("LCTestServlet: static block");
	}
	public LCTestServlet(){
		System.out.println("LCTestServlet:0-param constructor");
	}
	public void init(ServletConfig cg){
		System.out.println("LCTestServlet:init(Servletconfig)");
	}
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
	System.out.println("LCTestServlet:service(-,-)");
	res.setContentType("text/html");
	//get printWritter objeect
	PrintWriter pw=res.getWriter();
	Date d=new Date(0);
	pw.println("<b><i><center> Date and Time is "+d+" </b></i></center>");
	pw.close();
	}
}
