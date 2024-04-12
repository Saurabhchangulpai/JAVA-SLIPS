import java.sql.*;
import java.util.*;
class slip16_2
{
	public static void main(String args[])
	{
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		PreparedStatement ps1=null;
		PreparedStatement ps2=null;
		try{
			Class.forName("org.postgresql.Driver");
			con=DriverManager.getConnection("jdbc:postgresql:slip11","postgres","");
			//ps1=con.prepareStatement("create table teacher(tid int primary key,tname text,tsalary int)");
			//ps1.executeQuery();
			ps2=con.prepareStatement("insert into teacher values(?,?,?)");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter n :");
			int n=sc.nextInt();
			for(int i=0;i<n;i++)
			{
				System.out.println("Enter tid =");
				int tid=sc.nextInt();
				System.out.println("Enter tname =");
				String tname=sc.next();
				System.out.println("Enter tsal =");
				int tsalary=sc.nextInt();
				ps2.setInt(1,tid);
				ps2.setString(2,tname);
				ps2.setInt(3,tsalary);
				ps2.executeUpdate();
			}
			st=con.createStatement();
			rs=st.executeQuery("select * from teacher");
			while(rs.next())
			{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getInt(3));
			}
			con.close();
			
		}catch(Exception e){}
	}
}
