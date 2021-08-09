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

		// �����������
		request.setCharacterEncoding("gb2312");
		// ������Ӧ����
		response.setContentType("gb2312");
		// ���JSPҳ��������û�����ֵ
		String username=request.getParameter("name");
		// ���JSPҳ������������ֵ
		String pwd=request.getParameter("pwd");
		// ����DB�����ʹ�����еķ���������ж�
		DB db=new DB();
		// ���session��������������Ϣ��
		HttpSession session=request.getSession();
		// �Ȼ��user��������ǵ�һ�η��ʸ�Servlet���û�����϶�Ϊ�գ�������ǵ�
		// ���������ǵ����Σ��Ͳ�Ӧ�����жϸ��û�����Ϣ��
		User user=(User) session.getAttribute("user");
		// ��������ж� ������û��ǵ�һ�ν��룬����DB������ķ����ж�
		if(user==null){
			 user=db.checkUser(username, pwd);
		}
		// ��user�������session��
		session.setAttribute("user", user);
		if(user!=null){
			// ������ݲ�ѯ�û���Ϊ�յĻ�����ʾ�û�����������ȷ��Ӧ��ȥ��һ���档
			// ������ȥ�����棬�������а���������������Ϣ������Ҫ�����Ա��в������
			ArrayList al=db.findLyInfo();
			// ����ѯ����Ϣ������session��
			session.setAttribute("al", al);
			// Ȼ����ת������Ҫȥ��������
			response.sendRedirect("main.jsp");
		}else{
			// ����û������������Ļ��ص���¼����
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
