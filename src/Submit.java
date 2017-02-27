

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Submit {
	static PreparedStatement ps;
	static Connection con=null;
	public static int sub(String email,String pass,String name,long phone)
	{
		int n=0;
		try{
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
		System.out.println("Connection established");
		ps = con.prepareStatement("insert into login values('"+email+"','"+pass+"','"+name+"','"+phone+"')");
		n = ps.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return n;
	}
}
