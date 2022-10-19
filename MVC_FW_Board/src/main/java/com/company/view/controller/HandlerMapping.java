package com.company.view.controller;

import java.util.HashMap;
import java.util.Map;

import com.company.view.board.DeleteBoardController;
import com.company.view.board.GetBoardController;
import com.company.view.board.GetBoardListController;
import com.company.view.board.InsertBoardController;
import com.company.view.board.UpdateBoardController;
import com.company.view.user.LoginController;
import com.company.view.user.LogoutController;

/* �ڹ� ������ �־�ߵ�!
 * Map �������̽��� �������� HashMap Ŭ����
 * ��Map �������̽��� ������ �߿��� ������ �Ѵ�,.
 */
public class HandlerMapping {
	//���ʸ� ��� String�� �޵��� ���ش�.
	private Map<String, Controller> mappings;
	
	//������
	public HandlerMapping () {
		//hashmap�� ��ü�� ������,,
		mappings = new HashMap<String, Controller>();
		
		mappings.put("/login.do", new LoginController());
		mappings.put("/getBoardList.do", new GetBoardListController());
		mappings.put("/getBoard.do", new GetBoardController());
		mappings.put("/insertBoard.do", new InsertBoardController());
		mappings.put("/updateBoard.do", new UpdateBoardController());
		mappings.put("/deleteBoard.do", new DeleteBoardController());
		mappings.put("/logout.do", new LogoutController());
	}

//�����ڰ� �ʿ��� �޼ҵ带 ����
public Controller getController(String path) {
	return mappings.get(path);
}
}
