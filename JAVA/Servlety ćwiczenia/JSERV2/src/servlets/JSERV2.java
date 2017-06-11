package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JSERV2
 */
@WebServlet("/servPost")
public class JSERV2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JSERV2() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter out = response.getWriter();
	       
         String para1 = request.getParameter("para1");
         String para2 = request.getParameter("para2");
         String para3 = request.getParameter("para3");
  
         out.println("Twoje dane: ");
         out.println(para1);
         out.println(para2);
         out.println(para3);

	}

}
