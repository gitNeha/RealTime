package com.nt.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class HTMLServlet extends HttpServlet
{
	protected void service(HttpServletRequest  req, HttpServletResponse res ) throws ServletException ,IOException{
	
		//get Writer
		  PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		//write blogic 
		pw.println("<table border='1'  bgcolor='cyan' >");
		pw.println("<tr><th>NAME</th><th>PARTY</th><th>HYDERABAD</th><th>2019 results prediction</th></tr>");
		pw.println("<tr><th>modi</th><th>Bjp</th><th>Ameerpet</th><th>2019 results prediction</th></tr>");
		pw.println("<tr><th>nabin pattanaik</th><th>bjd</th><th>HYDERABAD</th><th>Super Win</th></tr>");
		pw.println("<tr><th>rahul gandhi</th><th>congrees</th><th>Hitec city</th><th>less Win</th></tr>");
		pw.println("</table>");
		res.setHeader("refresh","10");
		pw.println("<br><br><h1 style ='color:red'>Date and Time ::"+new java.util.Date()+"</h1>");    
//close stream
pw.close();
}
}