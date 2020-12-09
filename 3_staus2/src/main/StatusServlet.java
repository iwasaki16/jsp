package main;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
@WebServlet(urlPatterns={"/sts"})
public class StatusServlet extends HttpServlet {
public void doGet(HttpServletRequest request,
			HttpServletResponse response)
		throws ServletException, IOException {

	PrintWriter out = response.getWriter();
	status.Status g = new status.Status();
	out.println("yuor fortune is "+g.getResult());
    }
}