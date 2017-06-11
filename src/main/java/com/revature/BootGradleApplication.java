package com.revature;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.revature.test.Test;

@SpringBootApplication
public class BootGradleApplication {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		SpringApplication.run(BootGradleApplication.class, args);
		System.out.println("hi Spring boot");

		Test a = new Test();
		a.testConnection();
	}
}
