import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/add3")
public class addpagelogic3 extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		String ele="";
		for(Enumeration<String> e= request.getParameterNames(); e.hasMoreElements();)
		{
			ele = e.nextElement();
		}
		String[] check =request.getParameterValues("genre");
		boolean[] check1 = {false,false,false,false,false};
		for(String s : check)
		{
			check1[Integer.parseInt(s)]=true;
		}
		String[] check3 =request.getParameterValues("stock");
		boolean[] check2= {false,false};
		for(String s : check3)
		{
			check2[Integer.parseInt(s)]=true;
		}
		System.out.println(check);
		
		
    out.println("<html>");
    out.println("<head>");
    out.println("  <title>書籍登録確認画面</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("  <h2>■書籍在庫管理システム</h2>");
    out.println("    <h3>　【書籍登録確認画面】</h3>");
    out.println("    <form action=\"pages/addpage.jsp\">");
    out.println("      <table>");
    out.println("        <tr><td>　　</td><td>タイトル</td><td><input type=\"text\" name=\"title\" disabled=\"disabled\"/value=\"" + request.getParameter("title") + "\"></td></tr>");
    out.println("        <tr><td></td><td>著者</td><td><input type=\"text\" name=\"writer\" disabled=\"disabled\" /value=\"" + request.getParameter("writer") + "\"></td></tr>");
    out.println("        <tr><td></td><td>出版社</td><td><input type=\"text\" name=\"publisher\" disabled=\"disabled\" /value=\"" + request.getParameter("publisher") + "\"></td></tr>");
    out.println("        <tr><td></td><td>価格</td><td><input type=\"text\" name=\"price\" disabled=\"disabled\" /value=\"" + request.getParameter("price") + "\"></td></tr>");
    out.println("        <tr><td></td><td>ジャンル</td><td>");
    out.println("          <input type=\"checkbox\" name=\"genre\" value=\"0\" "+(check1[0]?"checked":"")+" disabled=\"disabled\"  />文芸");
    out.println("          <input type=\"checkbox\" name=\"genre\" value=\"1\" "+(check1[1]?"checked":"")+" disabled=\"disabled\" />実用");
    out.println("          <input type=\"checkbox\" name=\"genre\" value=\"2\" "+(check1[2]?"checked":"")+" disabled=\"disabled\" />ビジネス");
    out.println("          <input type=\"checkbox\" name=\"genre\" value=\"3\" "+(check1[3]?"checked":"")+" disabled=\"disabled\" />教養");
    out.println("          <input type=\"checkbox\" name=\"genre\" value=\"4\" "+(check1[4]?"checked":"")+" disabled=\"disabled\" />趣味</td></tr>");
    out.println("        <tr><td></td><td>在庫</td><td>");
    out.println("          <input type=\"radio\" name=\"stock\" value=\"1\" "+(check2[1]?"checked":"")+" disabled=\"disabled\" />あり");
    out.println("          <input type=\"radio\" name=\"stock\" value=\"0\" "+(check2[0]?"checked":"")+" disabled=\"disabled\" />なし</td></tr>");
    out.println("        <tr><td></td><td>備考</td><td><textarea name=\"remarks\" cols=\"40\" rows=\"4\" disabled=\"disabled\">" + request.getParameter("remarks") +"</textarea></td></tr>");
    out.println("        <tr><td></td><td height=\"30\"></td><td></td></tr>");
    out.println("        <tr><td></td><td></td><td align=\"right\">");
    out.println("          <input type=\"submit\" value=\"キャンセル\" />");
    out.println("      </table>");
    out.println("    </form>");
    out.println("</body>");
    out.println("</html>");
  }
	public void doPost(HttpServletRequest request,
			HttpServletResponse response) throws IOException
	{
		doGet(request,response);
	}
}