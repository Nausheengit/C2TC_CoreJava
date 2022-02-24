package tnsif.c2tc.m07;
import java.sql.*;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) throws Exception {
		//Scanner sc=new Scanner(System.in);
		//String name =sc.nextLine(); 
		//int uid = sc.nextInt();
		String url="jdbc:mysql://localhost:3306/m07details";
		String user="root";
		String pass="Qwerty@1234";
		//System.out.println(uid);
	   // System.out.println(name);
		//String query="SELECT * FROM m07details.studentdetails;";
		//String query="INSERT INTO `m07details`.`studentdetails` VALUES ("+uid+","+name+");";	
		//String query=" UPDATE `m07details`.`studentdetails` SET `user name` = 'Swapnil' WHERE (`uid` = '2110600')";
		String query="DELETE FROM `m07details`.`studentdetails` WHERE uid=2110621";	
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection(url,user,pass);
        Statement st= con.createStatement();
        //ResultSet rs= st.executeQuery(query);
        int rs = st.executeUpdate(query);
        System.out.println("no of rows updated is" + rs);
        //System.out.println("updated successfully");
          System.out.println("Deleted successfully");
        
        /*while (rs.next())
        {
        	int uid =rs.getInt(1);
        	String name =rs.getString(2);
        	System.out.println("UID of the student is "+ uid);
        	System.out.println("name of the student "+ name);
        }*/
       
        st.close();
        con.close();
	
	}
}
