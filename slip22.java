import java.util.*;
import java.sql.*;
import java.io.*;
class slip22 
{
	public static void main(String args[])
	{
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		PrepareStatement ps1=null,ps2=null,ps3=null;
		try{
			Class.forName("org.postgresql.Driver");
			con=DriverManager.getConnection("jdbc:postgresql:slip11","postgres","");
			if(con==null)
				System.out.println("Failed to connect ");
			else
			{
				st=con.createStatement();
				rs=st.executeQuery("
			
			}
		}catch(Exception e)
		{
			System.out.println("Error"+e);
		}
	}
}
