package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.*;
import db.DB;
public class AddServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public AddServlet() {
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
		// 获取title内容
		String title=request.getParameter("title");
		// 获取content内容
		String content=request.getParameter("content");
		// 从session中取出当前用户对象
		User user=(User) request.getSession().getAttribute("user");
		// 建立留言表对应JavaBean对象，把数据封装进去
		LyTable ly=new LyTable();
		ly.setUserId(user.getId());
		// 参数为获取的当前时间
		ly.setDate(new Date(System.currentTimeMillis()));
		ly.setTitle(title);
		ly.setContent(content);
		// 调DB类中的方法判断是否插入成功
		if(new DB().addInfo(ly)){
			response.sendRedirect("success.jsp");
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
