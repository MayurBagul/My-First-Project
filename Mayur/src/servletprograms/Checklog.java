package servletprograms;

import java.io.IOException;

import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.LogBean;
import daoOracle.ConnectOrac;

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
		boolean verified=false;
	 
		usename=request.getParameter("uname");
	 
		password=request.getParameter("pass");
		
		LogBean lb=new LogBean();
		
		lb.setUser_name(usename);
		lb.setPassword(password);
		
		ConnectOrac c=new ConnectOrac();
		
		c.connect();
		
		verified=c.loginFetch(lb);
		
		if(verified==true)
		{
			response.sendRedirect("ImageCal.jsp");
		}
		else
		{
			response.sendRedirect("error.html");
		}
		
		

		
		//l_user.add(usename);
		
		//ArrayList<String> l_pass=new ArrayList<>();
		
		//l_pass.add(password);
	
		
	}

}
