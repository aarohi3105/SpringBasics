package in.sp.controllers;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import sp.backend.model.User;

import in.db.conn.DbConnection;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/loginform")
public class Login extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException{
		PrintWriter out= res.getWriter();
		res.setContentType("text/html");
		String myemail= req.getParameter("email1");
		String mypassword=req.getParameter("pass1");
		
	try {
	Connection con = DbConnection.getConnection();
	String sql_query= "SELECT * FROM REGISTER WHERE email=? and passowrd=?";
	PreparedStatement ps= con.prepareStatement(sql_query);
	ps.setString(1, myemail);
	ps.setString(2,mypassword);
	ResultSet rs=ps.executeQuery();
	if(rs.next()) {
		User user = new User();
		user.setName(rs.getString("name"));
		user.setEmail(rs.getString("email"));
		user.setCity(rs.getString("city"));
		
		HttpSession session = req.getSession();
		session.setAttribute("session_user", user);
		RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
		rd.forward(req, res);
	}
	else {
		out.print("<h3 style='color:red'>Credentials didn't match</h3>");
		RequestDispatcher rd = req.getRequestDispatcher("/login.html");
		rd.include(req, res);
	}
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
