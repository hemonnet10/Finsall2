package com.sapient.test.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanUtil {

	private static final ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

	public static Object getBean(String id) {
		return context.getBean(id);
	}

}
