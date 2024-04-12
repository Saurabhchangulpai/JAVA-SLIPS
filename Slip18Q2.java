//get values form html and display student info

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Slip18Q2 extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		int seatNo = Integer.parseInt(req.getParameter("sno"));
		String sname = req.getParameter("sname");
		String clas = req.getParameter("clas");
		int sub = Integer.parseInt(req.getParameter("sub"));
		int total = Integer.parseInt(req.getParameter("marks"));
		
		PrintWriter out = res.getWriter();
		
		int per = total / sub;
		String grade;
		
		if(per > 90) 
		  grade = "O";
		else if(per > 80)
		  grade = "A";
		else if(per > 70)
		  grade = "B";
		else if(per > 50)
		  grade = "C";
		else if(per > 35)
		  grade = "D";
		else 
		  grade = "Fail";
		  
		out.print("Seat Number : " + seatNo);
		out.print("\nName : " + sname);
		out.print("\nClass : " + clas);
		out.print("\nTotal : " + total);
		out.print("\nPercentage : " + per);
		out.print("\nGrade : " + grade);
	}
}
