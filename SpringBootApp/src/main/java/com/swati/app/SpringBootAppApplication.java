package com.swati.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootAppApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(SpringBootAppApplication.class, args);
		DbConn dbc = ac.getBean("db",DbConn.class);
		dbc.showData();
	}

}
