package com.mst;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import com.mst.bean.Account;
import com.mst.config.Config;

public class Runner {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Account account = context.getBean(Account.class);
		/*
		 * try { account.deposit(500); } catch (Exception e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); }
		 */
		account.withdraw(200);
	}

}
