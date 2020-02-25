package pojo;

public class User {

	private String loginId;
	private String loginPwd;
	private String name;
	private String icoaddress;
	private String sex;
	private String intruduction;
	private String birthday;
	private String address;
	
	public User() {}
	public User(String loginId, String loginPwd) {
		super();
		this.loginId = loginId;
		this.loginPwd = loginPwd;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getLoginPwd() {
		return loginPwd;
	}
	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPicture() {
		return icoaddress;
	}
	public void setPicture(String picture) {
		this.icoaddress = picture;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getIntruduction() {
		return intruduction;
	}
	public void setIntruduction(String intruduction) {
		this.intruduction = intruduction;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getLocation() {
		return address;
	}
	public void setLocation(String location) {
		this.address = location;
	}
	
}
