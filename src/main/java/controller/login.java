package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = "ゲスト";
		String status = "ログイン失敗";
		
		request.setCharacterEncoding("UTF8");
		
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		
		if(id.equals("hoge") && pass.equals("pass")) {
			status = "ログイン成功";
			name = "hogehoge";
		}
		
		response.setContentType("text/html; charset=UTF8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title></title>");
		out.println("</head>");
		out.println("<body><br><br>");
		out.println(status + "<br><br>こんにちは " + name + " さん");
		out.println("</body>");
		out.println("</html>");
	}

}
