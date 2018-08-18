package servletprograms;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Logprocess
 */
@WebServlet("/Logprocess")
public class Logprocess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Logprocess() {
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
		
		String firstname=null,lastname=null,usename=null,mail=null,password=null;
		
		//firstname=request.getParameter("fname");
		
		//lastname=request.getParameter("lname");
		
		usename=request.getParameter("uname");
		
		//mail=request.getParameter("eid");
		
		password=request.getParameter("pass");
		
		if(usename.equals("Bat")&&password.equals("123"))
		{
			RequestDispatcher r=request.getRequestDispatcher("/homepage.jsp");
			
			r.forward(request, response);
			
		}
		
		else
		{
			
			System.out.println("Sorry You have Enter Wrong Credential !");
			
			RequestDispatcher r=request.getRequestDispatcher("/login.jsp");
			
			r.forward(request, response);
			
		}
		
	
		
		
		
	}

}
