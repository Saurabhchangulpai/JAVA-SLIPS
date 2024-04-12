import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Slip15Q2 extends HttpServlet {
    
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        
        Cookie[] cookies = req.getCookies(); 
        PrintWriter out = res.getWriter();
        
        if (cookies == null) {
            out.print("Welcome! You are visiting for the first time.");
            Cookie cookie = new Cookie("count", "1");
            res.addCookie(cookie); 
        } else {
            
            for (Cookie cookie : cookies) {
                
                if (cookie.getName().equals("count")) {
                    int count = Integer.parseInt(cookie.getValue()) + 1;
                    out.print("Welcome back! You have visited this page " + count + " times.");
                    cookie.setValue(String.valueOf(count));
                    res.addCookie(cookie); 
                    return;
                }
            }
            out.print("Welcome! You are visiting for the first time.");
            Cookie cookie = new Cookie("count", "1");
            res.addCookie(cookie); 
        }
    }
}

