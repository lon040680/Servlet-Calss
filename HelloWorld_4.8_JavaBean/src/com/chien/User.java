package com.chien;

//以下這個是廣義的JAVA BEAN, JAVA類也都可以叫 JAVA BEAN 但這是廣義的說法
@SuppressWarnings("serial")
public class User implements java.io.Serializable {
	//注意變數名稱第一個字一定要小寫
	private int userid;
	private String userName;
	
	//嚴格規定必須要要有空的構造方法 但是現在的版本不寫也可以因為會有預設 
	public User() {
		this.userid = 0;
		this.userName = "";
	}
	
	//這個不是嚴格的寫法，但是這樣也寫可以
	public User(int id, String name) {
		this.userid=id;
		this.userName=name;
	}
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
