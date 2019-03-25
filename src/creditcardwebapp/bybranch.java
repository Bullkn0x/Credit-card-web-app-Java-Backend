package creditcardwebapp;

import java.io.IOException;

import javax.servlet.http.*;

import dao.TransactionDao;
import model.transaction;

public class bybranch extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res)throws IOException{
		TransactionDao td3 = new TransactionDao();
		String state = req.getParameter("state");
		transaction mytransaction3 = null;
		try {
			mytransaction3 = td3.gettotalbyBranch(state);
		} catch (Exception e) {
			e.printStackTrace();
		}
		String format3= "\n%-18s %-18s  \n";
		res.getWriter().format (format3, "# of Transactions" , "Total Transaction Value"); 
		res.getWriter().format( format3, mytransaction3.getCount(), "$" +mytransaction3.getValue() );
	}
	
	
	
}