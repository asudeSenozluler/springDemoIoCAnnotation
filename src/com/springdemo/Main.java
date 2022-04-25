package com.springdemo;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(IocConfig.class)) {
			context.refresh();
				ICustomerService customerService= context.getBean("service",ICustomerService.class);
			
			
			customerService.add();
		} catch (BeansException | IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
		

	}

}
