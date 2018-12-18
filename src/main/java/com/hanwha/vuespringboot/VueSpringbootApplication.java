package com.hanwha.vuespringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = "com.hanwha.vuespringboot")
@MapperScan("com.hanwha.vuespringboot.mapper")
public class VueSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(VueSpringbootApplication.class, args);
	}
}
