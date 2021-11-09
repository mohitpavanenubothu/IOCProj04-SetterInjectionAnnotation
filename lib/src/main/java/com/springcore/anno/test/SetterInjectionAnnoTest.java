package com.springcore.anno.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.anno.bean.WishMessageGenerator;

public class SetterInjectionAnnoTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		WishMessageGenerator generator = ctx.getBean("wmg", WishMessageGenerator.class);
		String result = generator.generateMsg("Vinay Karthik");
		System.out.println("Wish Message is::" + result);
		ctx.close();
	}
}
