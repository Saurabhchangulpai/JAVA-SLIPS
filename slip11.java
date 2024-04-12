import java.sql.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
class slip11 extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		PrintWriter out=res.getWriter();
		out.printl("hello");
	}
}
Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		
		try
		{
			Class.forName("org.postgresql.Driver");
			con=DriverManager.getConnection("jdbc:postgresql:slip11","postgres","");
			if(con)
			{
				out.println("s");
			}
			st=con.createStatement();
			int c=Integer.parseInt(req.getParameter("t"));
			rs=st.executeQuery("select * from donar where did=1");
			PrintWriter out=res.getWriter();
			out.print("Donar not found");
			if(rs.next())
			{
				out.print("Donar id = "+rs.getInt(1));
				out.print("Donar name = "+rs.getString(2));
				out.print("Donar bloodGroup = "+rs.getString(3));
			}else{
				out.println("Donar not found");
			}
			con.close();
		}
		catch(Exception e){}
