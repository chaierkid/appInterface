package com.dyjs.swagger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
import com.mangofactory.swagger.models.dto.ApiInfo;
import com.mangofactory.swagger.plugin.EnableSwagger;
import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin;


/**
 * swagger配置
 * @author Dyan
 *
 */
@WebAppConfiguration
@EnableSwagger
@EnableWebMvc
@ComponentScan(basePackages ={"com.dyjs.controller"})  //制定扫描的controller包路劲
public class SwaggerConfig  {

	private SpringSwaggerConfig springSwaggerConfig;  
	  
    /** 
     * Required to autowire SpringSwaggerConfig 
     */  
    @Autowired  
    public void setSpringSwaggerConfig(SpringSwaggerConfig springSwaggerConfig)  
    {  
        this.springSwaggerConfig = springSwaggerConfig;  
    }  
  
    /** 
     * Every SwaggerSpringMvcPlugin bean is picked up by the swagger-mvc 
     * framework - allowing for multiple swagger groups i.e. same code base 
     * multiple swagger resource listings. 
     */  
    @Bean  
    public SwaggerSpringMvcPlugin customImplementation()  
    {  
        return new SwaggerSpringMvcPlugin(this.springSwaggerConfig)  
                .apiInfo(apiInfo())  
                .includePatterns(".*?");  
    }  
  
    private ApiInfo apiInfo()  
    {  
        ApiInfo apiInfo = new ApiInfo(  
                "APP接口",  
                "app开放的对外接口",  
                "Apps API terms of service",  
                "pandongyan@dyjs.com",  
                "web app",  
                "Apps API License URL");  
        return apiInfo;  
    }  

}
