package dao;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class QuizDetailDao extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException{

    response.setContentType("text/html; charset=utf-8");
    PrintWriter out = response.getWriter();

    out.println("<html>");
    out.println("<head>");
    out.println("<title>DB出力</title>");
    out.println("</head>");
    out.println("<body>");
    
	// JDMC接続先情報	
    String url = "jdbc:mysql://127.0.0.1/quiz";//URL
    String user = "root";  //DBユーザー
    String pass = "black9646abcSpta0808";    //DBパスワード

    Connection conn = null;

try {
  Class.forName("com.mysql.cj.jdbc.Driver");
  conn = DriverManager.getConnection(url, user, pass);

  Statement st = conn.createStatement();
  String sql = "SELECT * FROM qanda LEFT OUTER JOIN quizdetail ON qanda.quizid = quizdetail.quizid WHERE qanda.level=1 AND qanda.genre=1 ";
  ResultSet rs = st.executeQuery(sql);

  while(rs.next()){
    int quizid = rs.getInt("quizid");
    int quizdetailid = rs.getInt("quizdetailid");
    String level = rs.getString("level");
    String issue = rs.getString("issue");
    String img1 = rs.getString("img1");
    String img2 = rs.getString("img2");
    String note1 = rs.getString("note1");
    String note2 = rs.getString("note2");
    String note3 = rs.getString("note3");
    String note4 = rs.getString("note4");
    String genre = rs.getString("genre");
    String orderno = rs.getString("orderno");
    String title = rs.getString("title");
    out.println("<p>");
        out.println(quizid + title + level + genre + orderno + quizdetailid + issue + img1 + img2 + note1 + note2 + note3 + note4);
        out.println("</p>");
    }
    rs.close();
    st.close();
	}catch (ClassNotFoundException e){
    out.println("ClassNotFoundException:" + e.getMessage());
	}catch (SQLException e){
    out.println("SQLException:" + e.getMessage());
    }catch (Exception e){
    out.println("Exception:" + e.getMessage());
    }finally{
    try{
      if (conn != null){
        conn.close();
      }
    }catch (SQLException e){
      out.println("SQLException:" + e.getMessage());
    }
    }
    out.println("</body>");
    out.println("</html>");
}
}