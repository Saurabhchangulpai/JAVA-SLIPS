import java.io.*;
import java.util.*;
import java.sql.*;
class slip7_2
{
	public static void main(String args[])
	{
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try{
			Class.forName("org.postgresql.Driver");
			con=DriverManager.getConnection("jdbc:postgresql:slip7","postgres","");
			if(con==null)
				System.out.println("Connection faild");
			else
				System.out.println("Connection successfully");
			st=con.createStatement();
			rs=st.executeQuery("select * from Product");
			while(rs.next())
			{
				System.out.println("Product Id = "+rs.getInt(1));
				System.out.println("Product Name = "+rs.getString(2));
				System.out.println("Product Price = "+rs.getInt(3));
			}
			con.close();
		}catch(Exception e)
		{
		
		}
	}
}
