package kr.ac.hansung.cse;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.html.HTMLDocument.HTMLReader;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginServlet")//URL을 매핑시켜줌
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//read form data
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		//Process : access to database, perform business logic
		
		//Build HTML code
		PrintWriter out = response.getWriter();
		
		//동적인 웹페이지, username과 password의 입력에 따라 다른 출력값이 나오기 때문
		String htmlResponse = "<html>";
		htmlResponse += "<h2>Your username is " + username + "<br/>";
		htmlResponse += "<h2>Your password is " + password + "<br/>";
		htmlResponse += "</html>";
		
		out.println(htmlResponse);
		
	}
}
