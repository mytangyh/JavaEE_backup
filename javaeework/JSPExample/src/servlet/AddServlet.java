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

		// �����������
		request.setCharacterEncoding("gb2312");
		// ������Ӧ����
		response.setContentType("gb2312");
		// ��ȡtitle����
		String title=request.getParameter("title");
		// ��ȡcontent����
		String content=request.getParameter("content");
		// ��session��ȡ����ǰ�û�����
		User user=(User) request.getSession().getAttribute("user");
		// �������Ա��ӦJavaBean���󣬰����ݷ�װ��ȥ
		LyTable ly=new LyTable();
		ly.setUserId(user.getId());
		// ����Ϊ��ȡ�ĵ�ǰʱ��
		ly.setDate(new Date(System.currentTimeMillis()));
		ly.setTitle(title);
		ly.setContent(content);
		// ��DB���еķ����ж��Ƿ����ɹ�
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
