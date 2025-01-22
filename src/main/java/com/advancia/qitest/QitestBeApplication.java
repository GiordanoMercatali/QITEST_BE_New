package com.advancia.qitest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.advancia.qitest")
public class QitestBeApplication {

	public static void main(String[] args) {
		SpringApplication.run(QitestBeApplication.class, args);
	}

}
