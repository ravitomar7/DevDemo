package com.rt;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.Date;
public class Hello extends HttpServlet
{ 
int i;
public void init(ServletConfig config)
{
i=0;
}
 
public void doGet(HttpServletRequest req,HttpServletResponse res)  
throws ServletException,IOException  
{  i++;
res.setContentType("text/html");

PrintWriter out=res.getWriter();

out.println("<html><body>");  
out.println("Welcome"+req.getParameter("ravi")+i+" to servlet at"+new Date());  
out.println("</body></html>");  
  
out.close();

}}  

