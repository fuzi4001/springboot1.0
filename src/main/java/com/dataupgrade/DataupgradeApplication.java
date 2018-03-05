package com.dataupgrade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//开启过滤器
//@ServletComponentScan
public class DataupgradeApplication {
	private static final Logger logger = LoggerFactory.getLogger(DataupgradeApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DataupgradeApplication.class, args);
		logger.error("service start");
	}
}
