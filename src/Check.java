import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.SQLException;

public class Check {
	static Connection con=null;
	static PreparedStatement ps;
	static ResultSet rs;
	public static int loginCheck(String email,String pass)
	{
		int f=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
			System.out.println("Connection established");
			ps = con.prepareStatement("select * from login");
			rs=ps.executeQuery();
			
			while(rs.next())
			{
				if(email.equals(rs.getString(1)) && pass.equals(rs.getString(2)))
				{
				System.out.println("CHECKED");
				f = 1;	}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		} 
		return f;
	}
}
