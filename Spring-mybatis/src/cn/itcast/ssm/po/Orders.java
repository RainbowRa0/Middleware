package cn.itcast.ssm.po;

import java.util.Date;
import java.util.List;

public class Orders {
	private int id;
	private int user_id;
	private String number;
	private Date createtime;
	private String note;
	private User user;
	private List<Ordertail> ordertails;
	
	public List<Ordertail> getOrdertails() {
		return ordertails;
	}
	public void setOrdertails(List<Ordertail> ordertails) {
		this.ordertails = ordertails;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	@Override
	public String toString() {
		return "Orders [id=" + id + ", user_id=" + user_id + ", number=" + number + ", createtime=" + createtime
				+ ", note=" + note + ", user=" + user + ", ordertails=" + ordertails + "]";
	}
	
	
}
