package com.company.MVC_FW_Board.user;

public class UserDO {
		//��� �ʵ� ( ������Ƽ , �߰������)
	
	private String id;			//���̵�
	private String password;	//��й�ȣ
	private String name;		//�̸�
	private String rule;		// ���� - > �����ڳ� �Ϲݰ����̳ĸ� �ǵ���.
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
