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

/* 자바 개념이 있어야됨!
 * Map 인터페이스를 구현받은 HashMap 클래스
 * ㅡMap 인터페이스가 굉장히 중요한 역할을 한다,.
 */
public class HandlerMapping {
	//제너릭 기능 String만 받도록 해준다.
	private Map<String, Controller> mappings;
	
	//생성자
	public HandlerMapping () {
		//hashmap의 객체를 생성함,,
		mappings = new HashMap<String, Controller>();
		
		mappings.put("/login.do", new LoginController());
		mappings.put("/getBoardList.do", new GetBoardListController());
		mappings.put("/getBoard.do", new GetBoardController());
		mappings.put("/insertBoard.do", new InsertBoardController());
		mappings.put("/updateBoard.do", new UpdateBoardController());
		mappings.put("/deleteBoard.do", new DeleteBoardController());
		mappings.put("/logout.do", new LogoutController());
	}

//개발자가 필요한 메소드를 구현
public Controller getController(String path) {
	return mappings.get(path);
}
}
