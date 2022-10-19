package com.company.view.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DispatcherServlet extends HttpServlet{
   private static final long serialVersionUID = 1L;
   
   private HandlerMapping handlerMapping;
   private ViewResolver viewResolver;
   
   @Override  //재정의 
   public void init() throws ServletException {
      //객체 생성 후
      handlerMapping = new HandlerMapping();
      viewResolver = new ViewResolver();
      viewResolver.setPrefix("./");
      viewResolver.setSuffix(".jsp");
   }
   //생성자
   public DispatcherServlet() {
      super();
   }
   @Override //재정의
   protected void doGet(HttpServletRequest request, HttpServletResponse response) 
         throws ServletException, IOException {
      process(request, response);
      

   }
   @Override//재정의
   protected void doPost(HttpServletRequest request, HttpServletResponse response) 
         throws ServletException, IOException {
      request.setCharacterEncoding("EUC-KR");
      process(request, response);

   }
   
   //개발자가 필요한 메소드 구현
   private void process(HttpServletRequest request, HttpServletResponse response) {
      //1.클라이언트의 요청 path 정보 추출한다.
      /*
       * (예)
       * http://localhost:8087/MVC_FW_Board/login.do"
       * 위와 같이 URL 요청이 들어왔다고 가정하자!!!
       * 
       */
      String uri = request.getRequestURI(); // MVcC_Fw_board/login.do를 얻어냄
      int lastposition = uri.lastIndexOf("/"); // 13을 리턴
      String path = uri.substring(lastposition);
      //2. HandlerMapping을 통해서 패스에 해당되는 xxxcontroller를 탐색
      Controller ctrl = handlerMapping.getController(path);
      //3, 검색된 xxxcontroller를 실행
      String viewName = ctrl.handlerRequest(request, response);
      
   }
   
}