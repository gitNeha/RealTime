package com.nt.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MarriageServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException ,IOException{
		PrintWriter pw=null;
		String name=null,tage=null,gender=null;
		int age=0;
		boolean status=false;
		pw=res.getWriter();
		res.setContentType("text/html");
		name=req.getParameter("name");
		tage=req.getParameter("age");
		gender=req.getParameter("gender");
		age=Integer.parseInt((tage));
		
		//write the blogic 
		if(gender.equalsIgnoreCase("M"))
			status=age>=21?true:false;
			else
			
				status=age>=18?true:false;
			
		if(status){
			pw.println("<h1 style='color:red'>"+name+" you are eligible for marriage</h1>" );
			
			
				pw.println("<h1 style='color:red'>"+name+" you are  not eligible for marriage</h1>" );
			
			
				pw.println("<a href='input.html'></a>");
				pw.close();
		
		}
	}

}
