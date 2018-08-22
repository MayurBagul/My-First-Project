package servletprograms;
import bean.Logbin;
import dao.*;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.sql.Connection;
import java.sql.SQLException;



/**
 * Servlet implementation class Logprocess
 */
@WebServlet("/Logprocess")
public class Signdata extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Signdata() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		String firstname=null,lastname=null,mail=null,usename=null,password=null;
		
		firstname=request.getParameter("fname");
		
		lastname=request.getParameter("lname");
		
		mail=request.getParameter("eid");
		
		usename=request.getParameter("uname");
		
		password=request.getParameter("pass");
		
		Logbin b=new Logbin();
		
		b.setFname(firstname);
		b.setLname(lastname);
		b.setEid(mail);
		b.setUname(usename);
		b.setPass(password);
		
		ConnectDb c=new ConnectDb();
		
		Connection con=c.connect();
		
		Queries q=new Queries();
		
		q.Insert(con,b);
		
		HttpSession s=request.getSession();
		s.setAttribute("baen", b);
		
		RequestDispatcher r=request.getRequestDispatcher("/login.jsp");
		
		r.forward(request, response);
		
	}

}
