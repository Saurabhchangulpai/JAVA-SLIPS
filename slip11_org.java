import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
class slip11_org extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		PrintWriter out=res.getWriter();
		out.println("Hello");
	}
}
