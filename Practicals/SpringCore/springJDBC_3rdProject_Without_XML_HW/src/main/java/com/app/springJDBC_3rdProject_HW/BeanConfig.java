//package com.app.springJDBC_3rdProject_HW;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.AbstractApplicationContext;
//
//import model.JdbcConfig;
//import studentService.DAO.StudentService_Impl;
//
//public class BeanConfig {
//	public static StudentService_Impl getBeans() {
//		ApplicationContext apc = new AnnotationConfigApplicationContext(JdbcConfig.class);
//		StudentService_Impl bean = apc.getBean("studentService", StudentService_Impl.class);
//
//		((AbstractApplicationContext) apc).close();
//		return bean;
//
//	}
//}
