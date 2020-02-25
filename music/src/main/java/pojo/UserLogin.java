package pojo;

public class UserLogin {
//登录类
	private String id;
	private String pwd;
	private String profilepicture;
	public UserLogin() {}
	public UserLogin(String id, String pwd) {
		super();
		this.id = id;
		this.pwd = pwd;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getProfilepicture() {
		return profilepicture;
	}
	public void setProfilepicture(String profilePicture) {
		this.profilepicture = profilePicture;
	}
	
}
