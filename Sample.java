import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Sample extends HttpServlet {
  
  public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
    
    
    PrintWriter out = res.getWriter();
    out.print("hello");
  }
}
