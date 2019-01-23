package com.ces.erp.assetmanagement;

import com.ces.erp.tag.dialect.CesPermissionDialect;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//@EnableEurekaClient
@MapperScan("com.ces.erp.assetmanagement.*.dao")
public class AssetManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssetManagementApplication.class, args);
	}

	@Bean
	public CesPermissionDialect cesPermissionDialect(){
		return new CesPermissionDialect();
	}
}
