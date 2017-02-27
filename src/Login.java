

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Login() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		/*PrintWriter out = response.getWriter();
		String email1=(String)request.getParameter("u");
		String pass1=(String)request.getParameter("p");
		//System.out.println("email : "+email1 + "pass : "+pass1);
		int n = Check.loginCheck(email1,pass1);
		if(n == 1)
		{	//out.print("LOGIN SUCCESSFUL");
			RequestDispatcher view = request.getRequestDispatcher("signUp.html");
			//RequestDispatcher view = request.getRequestDispatcher(".html");
			view.forward(request,response);
		}
		else
			out.print("invalid credentials");*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter out = response.getWriter();
		String email1=(String)request.getParameter("u");
		String pass1=(String)request.getParameter("p");
		//System.out.println("email : "+email1 + "pass : "+pass1);
		int n = Check.loginCheck(email1,pass1);
		if(n == 1)
		{	out.print("LOGIN SUCCESSFUL");
		String msg="Sucess";
		/*getServletContext().setAttribute("key1", msg);*/
		HttpSession hs=request.getSession();
		hs.setAttribute("eid", email1);
		hs.setAttribute("pass", pass1);
			RequestDispatcher view = getServletContext().getRequestDispatcher("/logout.jsp");
			//out.println(<a href=http://www.imdb.com/</a>);
			//RequestDispatcher view = request.getRequestDispatcher(".html");
			//response.sendRedirect("http://www.imdb.com/");
			view.forward(request,response);
		}
		else
			out.print("invalid credentials");
	}
}
