package com.company.MVC_FW_Board.user;

public class UserDO {
		//멤버 필드 ( 프로퍼티 , 중간저장소)
	
	private String id;			//아이디
	private String password;	//비밀번호
	private String name;		//이름
	private String rule;		// 역할 - > 관리자냐 일반계정이냐를 판독함.
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRule() {
		return rule;
	}
	public void setRule(String rule) {
		this.rule = rule;
	}
	
	
}
