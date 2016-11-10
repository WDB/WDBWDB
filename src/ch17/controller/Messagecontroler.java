package ch17.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Messagecontroler
 */
@WebServlet("/Messagecontroler")
public class Messagecontroler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Messagecontroler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		requestpro(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		requestpro(request,response);
	}
	private void requestpro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String message = request.getParameter("message");
		Object result = null;
		if(message == null || message.equals("base")){
			result = "으하하하.";
		}
		else if(message.equals("name")){
			result = "홍길동입니다.";
		}
		else{
			result = "타입이 맞지 않습니다.";
		}
		request.setAttribute("result", result);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/ch17/messageview.jsp");
		dispatcher.forward(request, response);
	}
}
