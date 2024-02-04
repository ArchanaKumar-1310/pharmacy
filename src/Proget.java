import java.sql.*;
public class Proget {
	public static void getpro() throws Exception {String url = "jdbc:mysql://127.0.0.1:3306/pharmacy";
	String username = "root";
	String password = "T#9758@qlph";
	String Query = "select * from pharmacydt";
	Connection con = DriverManager.getConnection(url, username, password);
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery(Query);
	while(rs.next()) {
		System.out.println("product id:"+rs.getInt(1));
		System.out.println("product name:"+rs.getString(2));
		System.out.println("catogary:"+rs.getString(3));
		System.out.println("manifacturingdate:"+rs.getDate(4));
		System.out.println("expdate:"+rs.getDate(5));
		System.out.println("qty:"+rs.getDate(5));
		System.out.println("rate:"+rs.getInt(6));
		System.out.println("amount:"+rs.getInt(7));}
		
		
		
		
		
	}
	public static void main(String[] args) throws Exception {
		getpro();
		
	}

}
