package com.example.classes;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServelets
 */
@WebServlet("/TestServelets")
public class TestServelets extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServelets() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	String str	=request.getParameter("useraction");
		
		int i = Integer.parseInt(request.getParameter("usrval1"));
		int j=Integer.parseInt(request.getParameter("usrval2"));
		int k=0;
		 str=request.getParameter("useraction");

		if(str.equals("add"))
		  k=i+j;
		if(str.equals("mul"))
		  k=i*j;
		if(str.equals("div"))
		  k=i/j;
		response.getWriter().println(k);
		
	}

}
