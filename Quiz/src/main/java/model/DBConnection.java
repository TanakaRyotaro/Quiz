package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnection {
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
			// データベースのURL
			final String URL = "jdbc:mysql://127.0.0.1/quiz";
			// データベースにアクセスするユーザー
			final String USER = "root";
			// パスワード
			final String PASSWORD = "black9646abcSpta0808";

			Class.forName("com.mysql.cj.jdbc.Driver");
			// データベースへ接続する
			Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

			return con;
	}
}
