import java.sql.*;
public class Proupdate {
	public static void updatepro() throws Exception {
		String url = "jdbc:mysql://127.0.0.1:3306/pharmacy";
		String username = "root";
		String password = "T#9758@qlph";
		String Query = "update pharmacydt set amnt='300' where productid='2'";
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement pst = con.prepareStatement(Query);
		
		pst.executeUpdate();
		con.close();
	}
 public static void main (String[] args) throws Exception{
	 updatepro();
	 
 }
}
