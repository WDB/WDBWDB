package ch17.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
@WebServlet(
		urlPatterns = { "/Controller" }, 
		initParams = { 
				@WebInitParam(name = "propertyConfig", value = "command.properties")
		})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private Map<String, Object> commandMap = new HashMap<String,Object>();  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		String props = config.getInitParameter("propertyConfig");
		String realfolder = "/property";//property 파일이 저장된 폴더
		//웹 애플리케이션 루트 경로
		ServletContext context = config.getServletContext();
		//realfolder를 웹 애플리케이션 시스템상의 절대 경로로 변경
		String realpath = context.getRealPath(realfolder)+"\\"+props;
		
		//명령어와 처리 클래스의 매핑 정보를 저장할 properties  객체 생성
		Properties pr = new Properties();
		FileInputStream f = null;
		try{
			//command.properties 파일의 내용을 읽어옴
			f = new FileInputStream(realpath);
			//command.properties 내용을 properties 객체 pr에 저장
			pr.load(f);
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if(f!=null) try{f.close();} catch(IOException ex){}
		}
		//set 객체의 iterator() 메소드를 사용해 Iterator 객체를 얻어냄
		Iterator<?> keyiter = pr.keySet().iterator();
		
		while(keyiter.hasNext()){
			String command = (String)keyiter.next();
			String classname = pr.getProperty(command);
			try{
				Class<?> commandclass = Class.forName(classname);
				Object commandinstance = commandclass.newInstance();
				commandMap.put(command, commandinstance);
			}catch(Exception e){
				throw new ServletException(e);
			}
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		requestPro(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		requestPro(request, response);
	}
	private void requestPro(
		      HttpServletRequest request, HttpServletResponse response) 
		      throws ServletException, IOException {
		      String view = null;
		      Commandprocess com=null;
		      try{
		          String command = request.getParameter("command");
		          com = (Commandprocess)commandMap.get(command);  
		          view = com.requestPro(request, response);
		      }catch(Throwable e) {
		          throw new ServletException(e);
		      }   
		      RequestDispatcher dispatcher =request.getRequestDispatcher(view);
		      dispatcher.forward(request, response);
		   }
}
