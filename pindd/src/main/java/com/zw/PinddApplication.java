package com.zw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zw.dao")
public class PinddApplication {

	public static void main(String[] args) {
		SpringApplication.run(PinddApplication.class, args);
	}

}
