

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignUp
 */
@WebServlet("/SignUp")
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter out = response.getWriter();
		String email1=(String)request.getParameter("em");
		String pass1=(String)request.getParameter("p");
		String name1=(String)request.getParameter("n");
		long phone1=Long.parseLong(request.getParameter("ph"));
		out.println("email : "+email1 + "pass : "+pass1 + "name : "+name1+"phone : "+phone1);
		int n = Submit.sub(email1,pass1,name1,phone1);
		if(n == 1)
		{	//out.print("LOGIN SUCCESSFUL");
			RequestDispatcher view = request.getRequestDispatcher("Login.jsp");
			//RequestDispatcher view = request.getRequestDispatcher(".html");
			view.forward(request,response);
		}
		else
			out.print("invalid credentials");
	}

}
