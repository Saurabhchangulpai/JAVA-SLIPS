import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Slip19Q2 extends HttpServlet {
    
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        
        String uname = req.getParameter("uname");
        String pass = req.getParameter("pass");
        
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql:slips","postgres","");
            PrintWriter out = res.getWriter();
            
            if(con != null) {
                PreparedStatement pstmt = con.prepareStatement("SELECT * FROM register WHERE uname = ? AND pass = ?");
                pstmt.setString(1, uname);
                pstmt.setString(2, pass);
                
                rs = pstmt.executeQuery();
                
                if(rs.next()) 
                    out.print("Login Successfully");
                else 
                    out.print("Username and password do not exist");
            } else 
                out.print("Connection Failed");
        } catch (Exception e) {
           
        } 
    }
}

