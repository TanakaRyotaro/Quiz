package dao.entity;

import java.io.Serializable;

public class Quizdetail implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer quizdetailid;    //クイズ詳細ID
    private Integer quizid;
    private Integer answerid;
    private Integer orderno;
    private String issue;
    private String img1;
	private String img2;
	private String note1;
	private String note2;
	private String note3;
	private String note4;
	private String title;
	private String level;
	private String genre;
	private String judge;
	private String description;
	private String POSTGRES_DRIVER;

    //コンストラクタ
    public Quizdetail(){}

    //クイズ詳細ID
    public Integer getQuizdetailid() {
		return quizdetailid;
	}
	public void setQuizdetailid(Integer quizdetailid) {
		this.quizdetailid = quizdetailid;
	}
	public Integer getQuizid() {
		return quizid;
	}
	public void setQuizid(Integer quizid) {
		this.quizid = quizid;
	}
	public Integer getAnswerid() {
		return answerid;
	}
	public void setAnswerid(Integer answerid) {
		this.answerid = answerid;
	}
	public Integer getOrderno() {
		return orderno;
	}
	public void setOrderno(Integer orderno) {
		this.orderno = orderno;
	}
	public String getIssue() {
		return issue;
	}
	public void setIssue(String issue) {
		this.issue = issue;
	}
	public String getImg1() {
		return img1;
	}
	public void setImg1(String img1) {
		this.img1 = img1;
	}
	public String getImg2() {
		return img2;
	}
	public void setImg2(String img2) {
		this.img2 = img2;
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getlevel() {
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
	public String getJudge() {
		return judge;
	}
	public void setJudge(String judge) {
		this.judge = judge;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}