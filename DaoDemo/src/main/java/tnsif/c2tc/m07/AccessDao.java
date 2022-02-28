package tnsif.c2tc.m07;
import java.sql.*;
public class AccessDao {

	public void addStudent(Student s) throws Exception  {
		String url="jdbc:mysql://localhost:3306/m07details";
		String user="root";
		String pass="Qwerty@1234";
        String query="INSERT INTO `m07details`.`studentdetails` VALUES (?,?);";	
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection(url,user,pass);
        PreparedStatement st= con.prepareStatement(query);
        st.setInt(1, s.getUid());
        st.setString(2, s.getUsername());
        int rs = st.executeUpdate();
        st.close();
        con.close();
	}



    public Student getStudent() throws Exception
    {
    	String url="jdbc:mysql://localhost:3306/m07details";
		String user="root";
		String pass="Qwerty@1234";
		Student s=new Student();
        String query="SELECT * FROM m07details.studentdetails;";	
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection(url,user,pass);
        Statement st= con.createStatement();
        ResultSet rs=st.executeQuery(query);
        rs.next();
        while (rs.next())
        {
        	int uid =rs.getInt(1);
        	String name =rs.getString(2);
        	System.out.println(uid + " "+ name);
        	
        }
        
    	return s;
    }
}
