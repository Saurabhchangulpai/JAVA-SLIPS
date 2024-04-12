import java.sql.*;
import java.util.*;
class slip13
{
	public static void main(String args[])
	{
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		DatabaseMetaData dbmd=null;
		try
		{
			Class.forName("org.postgresql.Driver");
			con=DriverManager.getConnection("jdbc:postgresql:slip11","postgres","");
			dbmd=con.getMetaData();
			System.out.println("Database Product name : "+dbmd.getDatabaseProductName());
			System.out.println("Database Product version : "+dbmd.getDatabaseProductVersion());
			System.out.println("Database JDBC Driver name : "+dbmd.getDriverName());
			System.out.println("Database user name : "+dbmd.getUserName());
			
			
			System.out.println("Database tables detailes :");
			rs=dbmd.getTables(null,null,null,new String[]{"TABLE"});
			while(rs.next())
			{
				System.out.println(rs.getString("TABLE_NAME"));
			}
			con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
