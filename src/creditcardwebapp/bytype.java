package creditcardwebapp;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TransactionDao;
import model.transaction;
import resources.myQuries;

public class bytype extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {	
		
		TransactionDao td2 = new TransactionDao();
		System.out.println("Select a Category:");
		String category = req.getParameter("category");
		
		transaction mytransaction2 = null;
		try {
			mytransaction2 = td2.gettotalbyType(category);
		} catch (Exception e) {
			e.printStackTrace();
		}
		String format2 = "%-12s %-12s \n";
		res.getWriter().format (format2 , "Count" , "Total Value"); 
		res.getWriter().format(format2 , mytransaction2.getCount(), mytransaction2.getValue() );
		System.out.println("Finished");
	}


}





