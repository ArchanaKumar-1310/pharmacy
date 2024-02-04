import java.sql.*;
public class Insert {
	
	public static void insertval() throws Exception{
		String url = "jdbc:mysql://127.0.0.1:3306/pharmacy";
		String username = "root";
		String password = "T#9758@qlph";
		String Query = "insert into pharmacydt values(?,?,?,?,?,?,?,?)";
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement pst = con.prepareStatement(Query);
		pst.setInt(1, 2);
		pst.setString(2, "Acyclovir");
		pst.setString(3, "Tablet");
		pst.setDate(4, null,null);
		pst.setDate(5, null,null);
		pst.setInt(6, 5);
		pst.setInt(7, 20);
		pst.setInt(8, 100);
		
		
		pst.executeUpdate();
		
		con.close();
		
	}
	public static void main (String[]args) throws Exception{
		insertval();
	}

}
