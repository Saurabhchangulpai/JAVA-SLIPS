import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class Don extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
	 System.out.println("hello");
	 PrintWriter out= res.getWriter();
	 out.print("hello");
	 }
	
	}
