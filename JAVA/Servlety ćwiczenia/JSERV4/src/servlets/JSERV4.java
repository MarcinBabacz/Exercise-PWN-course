package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class JSERV4
 */
@WebServlet("/loginServ")
public class JSERV4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JSERV4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	//response.getWriter().append("Served at: ").append(request.getContextPath());
    	PrintWriter out = response.getWriter();
    	HttpSession ses = request.getSession(true);
    	if(ses.isNew()){
	    	response.sendRedirect("LoginForm.html");
	    	ses.invalidate();
    	}
    	else{
	    	out.println(ses.getAttribute("login"));
	    	out.println(ses.getAttribute("haslo"));
    	}
    }


    	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    	PrintWriter out = response.getWriter();
	    	HttpSession ses = request.getSession(true);
	    	ses.setMaxInactiveInterval(30);
	    	if(ses.isNew()){
		    	if(request.getParameter("login").equals("Ernest") && request.getParameter("haslo").equals("haslo")){
			    	ses.setAttribute("login", request.getParameter("login"));
			    	ses.setAttribute("haslo", request.getParameter("haslo"));
			    	out.println("Witaj " + ses.getAttribute("login"));
		    	}else{
			    	ses.invalidate();
			    	response.sendRedirect("LoginForm.html");
		    	}
	    	}else{
	    		doGet(request,response);
	    	}

    	}
}
