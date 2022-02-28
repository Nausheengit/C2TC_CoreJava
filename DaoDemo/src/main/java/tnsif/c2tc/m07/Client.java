package tnsif.c2tc.m07;
import java.sql.*;
public class Client {

	public static void main(String[] args) throws Exception {
		//Student s=new Student();
		//s.setUid(2110654);
		//s.setUsername("Tanvi");
		AccessDao ad= new AccessDao();
		//ad.addStudent(s);
		Student s1 = ad.getStudent();
		System.out.println(s1);

	}

}
