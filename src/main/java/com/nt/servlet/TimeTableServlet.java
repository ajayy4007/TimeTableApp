package com.nt.servlet;
import java.io.*;
import java.time.LocalDateTime;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;
import javax.servlet.*;

public class TimeTableServlet extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException ,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		LocalDateTime ldt=LocalDateTime.now();
		int hour=ldt.getHour();
		pw.println("<img src='images/ht.png;hight=50px;width=50px;text-align:corner'><h1 style='color=red;text-align:center'>"+ldt.toString()+"</h1>");
		if(hour<5)
             pw.println("<h1 style='color:sky blue;text-align:center'>Weakup time,Good Morning</h1>");
		else if(hour<10)
		pw.println("<h1 style='color:red;text-align:center'>BreakFast Time</h1>");
		else if(hour<12)
			pw.println("<h1 style='color:red;text-align:center'>Coading Time</h1>");
		else if(hour<14)
			pw.println("<h1 style='color:green;text-align:center'>Launch and Rest  Time,Good AfterNoon</h1>");
		else if(hour<16)
			pw.println("<h1 style='color:blue;text-align:center'>Reading time</h1>");
		else if(hour<18)
			pw.println("<h1 style='color:pink;text-align:center'>Attend the lecture,Good Evening</h1>");
		else if(hour<20)
			pw.println("<h1 style='color:orange;text-align:center'>Dinner Time</h1>");
		else if(hour<24)
			pw.println("<h1 style='color:gray;text-align:center'>Revise the privious Notes</h1>");
		else
			pw.println("<h1 style='color:green;text-align:center'>Sleeping time :Good Night</h1>");
		pw.println("<br><a href='http://localhost:8080/TimeTableApp/page.html'>home</a>");
		pw.close();
	}
	
	}

