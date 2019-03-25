package creditcardwebapp;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TransactionDao;
import model.transaction;

public class bytype extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {	
		
		TransactionDao td2 = new TransactionDao();
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
	}


}





