import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/add")
public class addpagelogic extends HttpServlet {
	public void doGet(HttpServletRequest request,
			HttpServletResponse response) throws IOException
	{
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		String ele="";
		for(Enumeration<String> e= request.getParameterNames(); e.hasMoreElements();)
		{
			ele = e.nextElement();
			//out.println(ele);
			for (String s : request.getParameterValues(ele)) {
				out.println(String.format("%s=%s<br>",ele,s));
		      }
		}
		out.println("\n");
	      }
	

	    
	
	
	public void doPost(HttpServletRequest request,
			HttpServletResponse response) throws IOException
	{
		doGet(request,response);
	}
}
