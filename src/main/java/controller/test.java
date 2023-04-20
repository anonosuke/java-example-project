package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TestGet")
public class test extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public test() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF8");
		response.setContentType("text/html; charset=UTF8");
		response.getWriter().append("get1:").append(request.getParameter("aaa"));
		response.getWriter().append("<BR>");
		response.getWriter().append("get2:").append(request.getParameter("bbb"));
	}
}
