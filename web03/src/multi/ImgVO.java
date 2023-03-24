package multi;

public class ImgVO {
	private String no;
	private String user;
	private String img;
	private String time;
	
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	private String ip;

	@Override
	public String toString() {
		return "ImgVO [no=" + no + ", user=" + user + ", img=" + img + ", time=" + time + ", ip=" + ip + "]";
	}
	
	
}
