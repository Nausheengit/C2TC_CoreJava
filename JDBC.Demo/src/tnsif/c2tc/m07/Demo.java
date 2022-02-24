package tnsif.c2tc.m07;
import java.sql.*;
public class Demo {

	public static void main(String[] args) throws Exception {
		String url="jdbc:mysql://localhost:3306/m07details";
		String user="root";
		String pass="Qwerty@1234";
		String query="SELECT * FROM m07details.studentdetails;";
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection(url,user,pass);
        Statement st= con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,  
                ResultSet.CONCUR_UPDATABLE);
        ResultSet rs= st.executeQuery(query);
        while (rs.next())
        {
        	int uid =rs.getInt(1);
        	String name =rs.getString(2);
        	System.out.println("UID of the student is "+ uid);
        	System.out.println("name of the student "+name);
        	
        }
        //System.out.println("UID of the student is"+ rs.getInt(1));
        //System.out.println("Name of the student is "+ rs.getString(2));
        st.close();
        con.close();
	
	}
}
