package com.fybdp.project.demo;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Configuration
	@EnableSwagger2
	public class SwaggerConfig {
		@Bean
		public Docket api() {
			return new Docket(DocumentationType.SWAGGER_2).useDefaultResponseMessages(false).select()
					.apis(RequestHandlerSelectors.basePackage("com.fybdp.project.demo"))
					.paths(PathSelectors.regex("/lool/convert-to.*")).build().apiInfo(apiInfo());
		}

		private ApiInfo apiInfo() {
			return new ApiInfo("REST API",
					"用于在线转换的JODConverter REST API。 JODConverter使用LibreOffice或Apache OpenOffice自动执行Office文档格式之间的转换。",
					"0.1", "Terms of service", new Contact("John Doe", "www.jodconverter.org", "johndoe@company.com"),
					"Apache License Version 2.0", "https://www.apache.org/licenses/LICENSE-2.0",
					Collections.emptyList());
		}
	}
}
