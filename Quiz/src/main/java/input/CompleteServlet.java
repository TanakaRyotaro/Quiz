package input;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.InputDao;
import dao.entity.User;

/**
 * Servlet implementation class InputServlet
 */
public class CompleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private InputDao inputDao = new InputDao();

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CompleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		// 入力値取得
		String name = request.getParameter("compName");
		String password = request.getParameter("compPassword");

		try{

			//入力チェック

			//ユーザーID取得
			List<Integer> userids = inputDao.selectUserid();
			
			//登録情報設定
			User user = new User();
			user.setUserid(uniqueId(userids));
			user.setName(name);
			user.setPassword(password);

			//ユーザー情報登録
			inputDao.userInsert(user);

			// confirm.jspを表示する
			request.getRequestDispatcher("complete.jsp").forward(request, response);
		}catch(Exception e) {
			e.printStackTrace();
			// index.jspを表示する
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
	}

	private int uniqueId(List<Integer> userids) {
		int uniqueId = 0;
		Random random = new Random();
		boolean success = false;
		while (!success) {
			success =true;
			uniqueId = random.nextInt(100000000);
			for(int id:userids) {
				if(uniqueId == id) {
					success =false;
					break;
				}
			}
		}
		return uniqueId;
	}

}