package com.blog.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@Configuration
@EnableSwagger2WebMvc
@Import(BeanValidatorPluginsConfiguration.class)
public class SwaggerConfig {
    @Bean(value = "defaultApi2")
    public Docket docket(Environment environment) {
        //如果在dev环境的话，就开启swagger
        boolean isDev = environment.acceptsProfiles(Profiles.of("dev"));
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("默认接口")
                .enable(isDev)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.blog.api.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * 配置Swagger的ApiInfo
     *
     * @return  Api配置信息
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("后端接口文档")
                .description("用于查看、测试后端api")
                .contact(new Contact("alateer", "https://github.com/alateer", "1265696937@qq.com"))
                .version("1.0.0")
                .build();
    }
}
