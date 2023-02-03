package com.gagae;

import com.fasterxml.classmate.TypeResolver;
import com.gagae.youtube.framework.adapters.output.youtube.mono.YoutubeVideoMono;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.HashSet;
import java.util.Set;

@Configuration
public class SwaggerConfig {

    //http://localhost:8080/swagger-ui/index.html#/ 접속

    private ApiInfo swaggerInfo() {
        return new ApiInfoBuilder().title("Hood API")
                .description("Hood API Docs").build();
    }

    @Bean
    public Docket swaggerApi(TypeResolver typeResolver) {
        return new Docket(DocumentationType.SWAGGER_2)
                .consumes(getConsumeContentTypes())
                .produces(getProduceContentTypes())
                .additionalModels(
                        typeResolver.resolve(YoutubeVideoMono.class)
                )
                .apiInfo(swaggerInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("com.gagae.youtube.framework.adapters.input.rest"))
                .paths(PathSelectors.any())
                .build()
                .useDefaultResponseMessages(false);
    }

    private Set<String> getConsumeContentTypes() {
        Set<String> consumes = new HashSet<>();
        consumes.add("application/json;charset=UTF-8");
        consumes.add("application/x-www-form-urlencoded");
        return consumes;
    }

    private Set<String> getProduceContentTypes() {
        Set<String> produces = new HashSet<>();
        produces.add("application/json;charset=UTF-8");
        return produces;
    }
}
