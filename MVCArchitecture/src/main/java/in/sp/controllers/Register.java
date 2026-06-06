package in.sp.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import in.db.conn.DbConnection;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/registerform")
public class Register extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException {
	String myname=req.getParameter("name1");
	String myemail=req.getParameter("email1");
	String mypass=req.getParameter("pass1");
	String mycity=req.getParameter("city1");

 try {
	 Connection con=DbConnection.getConnection();
	 String insert_query ="INSERT INTO REGISTER VALUES(?,?,?,?)";
	 PreparedStatement ps=con.prepareStatement(insert_query);
	 ps.setString(1,myname);
	 ps.setString(2,myemail);
	 ps.setString(3,mypass);
	 ps.setString(4,mycity);
	 int count = ps.executeUpdate();
	 if(count>0) {
		 res.setContentType("text/html");
		 PrintWriter out = res.getWriter();
		 out.print("<h3 style ='color:green'>registered succesfully </h3>");
		 RequestDispatcher rd = req.getRequestDispatcher("/login.html");
		 rd.include(req, res);
	 }
	 else {
		 PrintWriter out = res.getWriter();
		 out.print("<h3 style ='color:red'>registerion failed </h3>");
		 RequestDispatcher rd = req.getRequestDispatcher("/register.html");
		 rd.include(req, res);
	 }
	 }catch(Exception e) {
	 e.printStackTrace();
 }
}
}