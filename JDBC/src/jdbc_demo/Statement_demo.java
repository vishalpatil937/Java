package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Statement_demo {
	public static void main(String[] args) {
		Connection connection=null;
		Statement statement=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");	
			statement=connection.createStatement();
			System.out.println("Connected");
			
			int empid1;
			String name1;
			String designation1;
			String location1 ;
			int salary1;
			
//			Custom input
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter  Employee ID:");
			empid1=sc.nextInt();
			System.out.println("Enter Employee Name: ");
			name1=sc.next();
			System.out.println("Enter Designation: ");
			designation1=sc.next();
			System.out.println("Enter location: ");
			location1=sc.next();
			System.out.println("Enter  Salary: ");
			salary1=sc.nextInt();
			
			//Custom Using statement
			String insert="insert into empdetails values ("+empid1 +",'"+name1+"','"+designation1+"'," + "'" +location1 +"',"+salary1+");"  ;
			
			int i=statement.executeUpdate(insert);
			if(i>0)
				System.out.println("Rows Affected :"+i);
			else
				System.out.println("Update failed");
			
			
//			Using Prepared statement
			
			PreparedStatement prepared_statement=connection.prepareStatement("insert into empdetails values(?,?,?,?,?);");
			
			prepared_statement.setInt(1, 147);
			prepared_statement.setString(2, "PrepState");
			prepared_statement.setString(3, "Admin");
			prepared_statement.setString(4, "Mumbai");
			prepared_statement.setInt(5, 50000);
			
			int res=prepared_statement.executeUpdate();
			if(res>0)
				System.out.println("Prepared statement Updated successfully");
			else
				System.out.println("Prepared statement Update Failed");
			
//			Custom using prepared Statement
			prepared_statement.setInt(1, empid1);
			prepared_statement.setString(2, name1);
			prepared_statement.setString(3, designation1);
			prepared_statement.setString(4, location1);
			prepared_statement.setInt(5, salary1);
			res=prepared_statement.executeUpdate();
			if(res>0)
				System.out.println("Custom entry Updated successfully");
			else
				System.out.println("Custom entry Update Failed");
			
//			Display all results
			ResultSet rs=statement.executeQuery("select * from empdetails");
			System.out.println(rs.getRow());
			
			while(rs.next()) {
				int empid=rs.getInt("empid");
				String name=rs.getString("name");
				String designation =rs.getString("designation");
				String location =rs.getString("location");
				int salary =rs.getInt("salary");
				
				System.out.println("EmpID: "+empid+" Name: "+name+" Desig: "+designation+" Location: "+location+" Salary: "+salary);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
