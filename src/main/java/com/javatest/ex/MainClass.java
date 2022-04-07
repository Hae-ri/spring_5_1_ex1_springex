package com.javatest.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String configLocation = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		StudentInfo studentInfo = ctx.getBean("StudentInfo",StudentInfo.class);
		studentInfo.getStudentInfoPrint(); // 홍길동 정보
		
		// 김유신 정보
		Student student2 = ctx.getBean("student2",Student.class); 
		studentInfo.setStudent(student2); // 세터를 이용
		studentInfo.getStudentInfoPrint();
		
		
		ctx.close();
	}

}
