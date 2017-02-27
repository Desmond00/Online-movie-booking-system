

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ticket
 */
@WebServlet("/ticket")
public class ticket<E> extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       String[] str5;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ticket() {
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
	@SuppressWarnings("rawtypes")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter pw=response.getWriter();
		
		response.setContentType("text/html");
		//int j=Integer.parseInt(request.getParameter("seat"));
		//pw.println("hello");
		
		Enumeration e=request.getParameterNames();
		while(e.hasMoreElements())
		{String str=(String)e.nextElement();
		 str5=request.getParameterValues(str);
		
		}
			for(int i=0;i<str5.length;i++){
				
				
				System.out.println(str5.length);
				System.out.println(str5[0]);
				String str3=str5[0];

				int j=Integer.parseInt(str3);
				
				if(i==j)
				{
				pw.println(str5[i]);
				break;
				}
			}
	}
}
