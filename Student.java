

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

@WebServlet("/Student")
public class Student extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		String url="jdbc:mysql://localhost:3306/mydb";
		String user="root";
		String pw="root";
		String driver="com.mysql.jdbc.Driver";
		PrintWriter out=response.getWriter();
		
		
		PreparedStatement p;
		
		try{
			Class.forName(driver).newInstance();
			Connection con=DriverManager.getConnection(url,user,pw);
			System.out.print("COnnection established");
			
			String query="insert into stud values (?,?);";
			p=con.prepareStatement(query);
			
			Scanner s=new Scanner(System.in);
			
			String s1=request.getParameter("name");
			String s2=request.getParameter("usn");
			p.setString(1, s1);
			p.setString(2, s2);
			int i=p.executeUpdate();
			out.println("<html><body>"
					+ "Number of records changed="+i );
			
			
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from stud");
			out.println("The database contains <br>"
					+ "Name  USN");
			while(rs.next()==true){
				out.println(rs.getString(1)+" "+rs.getString(2));
			}
			
		}catch(Exception e){
			System.out.print(e);
		}
		
	}


}
