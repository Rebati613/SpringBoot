package com.swati.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("db")
public class DbConn {
	
	@Value("OracleDriver")
	private String driver;
	@Value("jdbc:oracle")
	private String url;
	
	public void showData() {
		System.out.println("Data is ::"+driver+url);
	}
}
