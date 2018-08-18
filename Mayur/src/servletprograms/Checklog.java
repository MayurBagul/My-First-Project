package servletprograms;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Checklog
 */
@WebServlet("/Checklog")
public class Checklog extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Checklog() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	 String	usename=null,password=null;
	 
	 usename=request.getParameter("uname");
	 
	 password=request.getParameter("pass");
		
		if(usename.equals("Bat")&&password.equals("123"))
		{
			RequestDispatcher r=request.getRequestDispatcher("/ImageCal.jsp");
			
			r.forward(request, response);
			
		}
		
		else
		{
			
			System.out.println("Sorry You have Enter Wrong Credential !");
			
			RequestDispatcher r=request.getRequestDispatcher("/login.jsp");
			
			r.include(request, response);
			
		}
		
		
	}

}
