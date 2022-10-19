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
   
   @Override  //������ 
   public void init() throws ServletException {
      //��ü ���� ��
      handlerMapping = new HandlerMapping();
      viewResolver = new ViewResolver();
      viewResolver.setPrefix("./");
      viewResolver.setSuffix(".jsp");
   }
   //������
   public DispatcherServlet() {
      super();
   }
   @Override //������
   protected void doGet(HttpServletRequest request, HttpServletResponse response) 
         throws ServletException, IOException {
      process(request, response);
      

   }
   @Override//������
   protected void doPost(HttpServletRequest request, HttpServletResponse response) 
         throws ServletException, IOException {
      request.setCharacterEncoding("EUC-KR");
      process(request, response);

   }
   
   //�����ڰ� �ʿ��� �޼ҵ� ����
   private void process(HttpServletRequest request, HttpServletResponse response) {
      //1.Ŭ���̾�Ʈ�� ��û path ���� �����Ѵ�.
      /*
       * (��)
       * http://localhost:8087/MVC_FW_Board/login.do"
       * ���� ���� URL ��û�� ���Դٰ� ��������!!!
       * 
       */
      String uri = request.getRequestURI(); // MVcC_Fw_board/login.do�� ��
      int lastposition = uri.lastIndexOf("/"); // 13�� ����
      String path = uri.substring(lastposition);
      //2. HandlerMapping�� ���ؼ� �н��� �ش�Ǵ� xxxcontroller�� Ž��
      Controller ctrl = handlerMapping.getController(path);
      //3, �˻��� xxxcontroller�� ����
      String viewName = ctrl.handlerRequest(request, response);
      
   }
   
}