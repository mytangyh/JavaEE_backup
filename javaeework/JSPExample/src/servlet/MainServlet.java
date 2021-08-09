package servlet;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.User;
import db.DB;
import java.io.PrintWriter;


public class MainServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public MainServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 设置请求编码
		request.setCharacterEncoding("gb2312");
		// 设置响应编码
		response.setContentType("gb2312");
		// 获得JSP页面填入的用户名的值
		String username=request.getParameter("name");
		// 获得JSP页面填入的密码的值
		String pwd=request.getParameter("pwd");
		// 建立DB类对象，使用其中的方法来完成判断
		DB db=new DB();
		// 获得session对象，用来保存信息，
		HttpSession session=request.getSession();
		// 先获得user对象，如果是第一次访问该Servlet，用户对象肯定为空，但如果是第
		// 二次甚至是第三次，就不应该在判断该用户的信息。
		User user=(User) session.getAttribute("user");
		// 这里就是判断 ，如果用户是第一次进入，调用DB类里面的方法判断
		if(user==null){
			 user=db.checkUser(username, pwd);
		}
		// 把user对象存在session中
		session.setAttribute("user", user);
		if(user!=null){
			// 如果根据查询用户不为空的话，表示用户名和密码正确，应该去下一界面。
			// 这里是去主界面，主界面中包含了所有留言信息，所以要从留言表中查出来。
			ArrayList al=db.findLyInfo();
			// 包查询的信息保存在session中
			session.setAttribute("al", al);
			// 然后跳转到我们要去的主界面
			response.sendRedirect("main.jsp");
		}else{
			// 如果用户名和密码错误的话回到登录界面
			response.sendRedirect("login.jsp");
		}
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request,response);
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
