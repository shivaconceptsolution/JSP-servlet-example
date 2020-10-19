package scs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestHTMLDesign
 */
@WebServlet("/TestHTMLDesign")
public class TestHTMLDesign extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.print("<h1>Hello world</h1>");
		out.print("<p>Hello world sxdsadsafd</p>");
		out.print("<marquee>Welcome in Java, CSS, HTML </marquee>");
		
	}

	
}
