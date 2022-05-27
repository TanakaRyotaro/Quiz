package dao.entity;

public class User {

	private Integer userid;
	private String name;
	private String password;
	private String usertitle;

	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsertitle() {
		return usertitle;
	}
	public void setUsertitle(String usertitle) {
		this.usertitle = usertitle;
	}
}