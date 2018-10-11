package com.collabo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@Configuration
@EnableSwagger2
//@EnableAutoConfiguration
public class SwaggerConfig {
	 
	//The api function declares the set of REST endpoints we want to have documented.
	@Bean
	    public Docket api() {
	        return new Docket(DocumentationType.SWAGGER_2)
	               .select()
	               .apis(RequestHandlerSelectors.any())
	               .paths(PathSelectors.regex("/user.*|/role.*|/roles.*|/access.*|/permission.*|"))     
	               // .PathSelectors.any() // for all
	               .build().apiInfo(apiInfo());
	    }

	 //The apiInfo function returns some information about the API we've implemented.
	    private ApiInfo apiInfo() {
	        @SuppressWarnings("deprecation")
	        ApiInfo apiInfo = new ApiInfo(
	                "Professionals hub",
	                "Microservice for  CollaboUg ,An Application for Professional Service Networking",
	                "1.0.0",
	                "https://... URL for the Terms and Services",
	                "Tendo kiiza Martyn <tmkmart@gmail.com>",
	                "a License of API",
	                "https://... URL for the license");
	        return apiInfo;
	    }
}
