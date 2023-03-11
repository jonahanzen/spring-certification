package br.com.hermes.certification.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Classe de configuracao do Swagger A classe habilita o swagger e scaneia as
 * classes dentro de "br.com" documentando todos os caminhos e requisicoes
 * 
 */
//@Configuration
//@EnableSwagger2
public class SwaggerConfig {

	//TODO Config
	
	
//	@Bean
//	public Docket api() {
//		return new Docket(DocumentationType.SWAGGER_2).select()
//				.apis(RequestHandlerSelectors.basePackage("br.com.hermes.certification")).paths(PathSelectors.any())
//				.build();
//	}
//
//
//
//	private ApiInfo apiInfo() {
//		return new ApiInfoBuilder()
//				
//				.title("Financas REST")
//				.description("Documentacao SWAGGER API Financas REST")
//				.version("1.0.0")
//				.contact(new Contact("Jonathan H Flores", "https://github.com/jonahanzen", "jona_hanzen@hotmal.com"))
//				.build();
//				
//	}

}