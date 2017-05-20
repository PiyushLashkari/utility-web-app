package com.learn.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
*
*
* @author plashkar
* @version 1.0
* @date Jun 16, 2015
*/
@ComponentScan(basePackages="com.learn")
@EnableAutoConfiguration
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(new Object[] { Application.class}, args);
	}

}