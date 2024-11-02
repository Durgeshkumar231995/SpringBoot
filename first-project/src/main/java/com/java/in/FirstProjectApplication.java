package com.java.in;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.java.in.condition.DataSourceConfig;

@SpringBootApplication
public class FirstProjectApplication implements CommandLineRunner{

	@Autowired
	private DataSourceConfig dataSourceConfig;

	public static void main(String[] args) {
		SpringApplication.run(FirstProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		dataSourceConfig.makeConnection();
	}
}
