		package tnsif.c2tc.m07;
		import java.sql.*;
		import java.sql.SQLException;
		public class Demo1 {

			public static void main(String[] args) throws Exception {
				String url="jdbc:mysql://localhost:3306/m07details";
				String user="root";
				String pass="Qwerty@1234";
				String query=" UPDATE `m07details`.`studentdetails` SET `user name` = 'Nausheen Shaikh' WHERE (`uid` = '2110610')";
				//String query="DELETE FROM `m07details`.`studentdetails` WHERE uid=2110624";	
				Class.forName("com.mysql.cj.jdbc.Driver");
		        Connection con= DriverManager.getConnection(url,user,pass);
		        Statement st= con.createStatement();
		        //ResultSet rs= st.executeQuery(query);
		        int rs = st.executeUpdate(query);
		        System.out.println("no of rows updated is" + rs);
		        //System.out.println("Deleted successfully" + rs);
		        st.close();
		        con.close();
			
			}
		


	}


