//get value from html and search for cno if present display details else error msg

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Slip11Q1 extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		int cno = Integer.parseInt(req.getParameter("num"));
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql:slips", "postgres", "");
			PrintWriter out = res.getWriter();
			
			if(con != null) {
			
				st = con.createStatement();
				rs = st.executeQuery("select * from cust where cno = " + cno);
				
				if(rs.next()) {
					
					out.print("Customer No. : " + rs.getInt(1));
					out.print("\nCustomer Name : " + rs.getString(2));
						
				}
			
			}else 
			  out.print("Customer does not exists");
		}catch(Exception e) {}
	}
}
