package com.fortis.inspection;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fortis.inspection.dao")
public class InspectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(InspectionApplication.class, args);
	}

}
