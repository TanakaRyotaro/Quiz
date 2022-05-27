package model.dao.dto;

/**
	 * Todoを保持するクラス
	 * @author yuhablog
	 */
	public class TodoDTO {
		/**
		 * TodoのIdを保持する
		 */
		private int quizid;
		private String title;
		private String level;
		private String genre;
		private String orderno;
		private String issue;
		private String img1;
		private String note1;
		private String note2;
		private String note3;
		private String note4;
		
		public TodoDTO () {
			quizid = 0;
			title = "";
			level = "";
			genre = "";
			orderno = "";
			issue = "";
			img1 = "";
			note1 = "";
			note2 = "";
			note3 = "";
			note4 = "";
		}

		
		public TodoDTO(int quizid, String title, String level, String genre, String orderno, String issue, String img1, String note1, String note2, String note3, String note4) {
			this.quizid = quizid;
			this.title = title;
			this.level = level;
			this.genre = genre;
			this.orderno = orderno;
			this.issue = issue;
			this.img1 = img1;
			this.note1 = note1;
			this.note2 = note2;
			this.note3 = note3;
			this.note4 = note4;
		}
		/**
		 * quizidを取得する
		 * @return quizid
		 */
		public int getQuizid() {
			return quizid;
		}
		/**
		 * quizidを設定する
		 * @param quizid
		 */
		public void setQuizId(int quizid) {
			this.quizid = quizid;
		}
		/**
		 * issueの内容を取得する
		 * @return の内容
		 */
		public String getIssue() {
			return issue;
		}
		/**
		 * issueの内容を設定する
		 * @param issue
		 */
		public void setIssue(String issue) {
			this.issue = issue;
		}		
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getLevel() {
			return level;
		}
		public void setLevel(String level) {
			this.level = level;
		}
		public String getGenre() {
			return genre;
		}
		public void setGenre(String genre) {
			this.genre = genre;
		}
		public String getOrderno() {
			return orderno;
		}
		public void setOrderno(String orderno) {
			this.orderno = orderno;
		}
		public String getImg1() {
			return img1;
		}
		public void setImg1(String img1) {
			this.img1 = img1;
		}
		public String getNote1() {
			return note1;
		}
		public void setNote1(String note1) {
			this.note1 = note1;
		}
		public String getNote2() {
			return note2;
		}
		public void setNote2(String note2) {
			this.note2 = note2;
		}
		public String getNote3() {
			return note3;
		}
		public void setNote3(String note3) {
			this.note3 = note3;
		}
		public String getNote4() {
			return note4;
		}
		public void setNote4(String note4) {
			this.note4 = note4;
		}
	}