import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class slip2_2 extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		ServletConfig config=getServletConfig();
		ServletContext context = getServletContext();
		
		out.println("hahahh");
		
	}
}
