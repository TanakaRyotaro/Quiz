package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.DBConnection;
import model.dao.dto.TodoDTO;

/**
 * Todoの一覧を取得するクラス
 *
 * @author yuhablog
 */
public class TodoListDAO {

	/**
	 * Todoの一覧を取得する
	 * @return todoの一覧
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public List<TodoDTO> getTodoList() throws ClassNotFoundException, SQLException {
		// 返却用Listの初期化
		List<TodoDTO> todoList = new ArrayList<>();

		// 実行するSQL
		String sql = "SELECT quizid, title, level, genre, orderno, issue, img1, note1, note2, note3, note4 from (qanda,quizdetail)";

		// DBに接続し、Todo一覧を取得する
		try (Connection con = DBConnection.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)) {

			// SQLを実行しResultSetの変数に結果を格納する
			ResultSet res = pstmt.executeQuery();
			// 実行結果を順番に取り出す
			while (res.next()) {
			        //  それぞれid, todo, timeLimitを取得する
				int quizid = res.getInt("quizid");
				String title = res.getString("title");
				String level = res.getString("level");
				String genre = res.getString("genre");
				String orderno = res.getString("orderno");
				String issue = res.getString("issue");
				String img1 = res.getString("img1");
				String note1 = res.getString("note1");
				String note2 = res.getString("note2");
				String note3 = res.getString("note3");
				String note4 = res.getString("note4");

				// 取得したid, todo, timeLimitでTodoDTOを初期化してListに追加
				todoList.add(new TodoDTO(quizid,title,level,genre,orderno,issue,img1,note1,note2,note3,note4));
			}
		}

		return todoList;
	}
}