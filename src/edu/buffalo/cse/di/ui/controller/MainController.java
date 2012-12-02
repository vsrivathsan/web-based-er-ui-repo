package edu.buffalo.cse.di.ui.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class MainController
 */
public class MainController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MainController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/xml");
        response.setHeader("Cache-Control", "no-cache");
        HttpSession sess = request.getSession();
        
        String entityRecords = request.getParameter("records");
        System.out.println("Entered Servlet: "+entityRecords);
        String[] entityRecordsArr = entityRecords.split("<br />");
        //String[] entityRecordsArr = entityRecords.split(System.getProperty("line.seperator"));
        String processedResult = "";
        for (String entityRecord: entityRecordsArr) {
        	//Process the entity Records
        	System.out.println("Entered");
        	processedResult = processedResult + entityRecord + "\n";
        	System.out.println(entityRecord);
        }
        System.out.println("Before Exiting: "+processedResult);
        out.println(processedResult);
	}

}
