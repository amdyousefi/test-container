package com.ernyka.testcontainer.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/** Web Configuration for the entire app */
@Configuration
@EnableWebMvc
public class WebConfig {

  @Bean
  public WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> enableDefaultServlet() {
    return factory -> factory.setRegisterDefaultServlet(true);
  }

  /*
   * @Bean public Greeting greeting() { Greeting greeting = new Greeting(); greeting.setMessage("Hello World !!");
   * return greeting; }
   */
  @Bean
  public ObjectMapper objectMapper() {
    return new ObjectMapper();
  }
}
/*
 * import org.springframework.boot.web.servlet.FilterRegistrationBean; import
 * org.springframework.context.annotation.Bean; import org.springframework.context.annotation.Configuration; import
 * org.springframework.core.Ordered; import org.springframework.web.cors.CorsConfiguration; import
 * org.springframework.web.cors.UrlBasedCorsConfigurationSource; import org.springframework.web.filter.CorsFilter;
 *
 *
 * @Configuration public class WebConfig {
 *
 * @Configuration public class CorsConfig {
 *
 * @Bean public FilterRegistrationBean customCorsFilter() { UrlBasedCorsConfigurationSource source = new
 * UrlBasedCorsConfigurationSource(); CorsConfiguration config = new CorsConfiguration();
 * config.setAllowCredentials(true); config.addAllowedOrigin("*"); config.addAllowedHeader("*");
 * config.addAllowedMethod("*"); source.registerCorsConfiguration("/**", config); FilterRegistrationBean bean = new
 * FilterRegistrationBean(new CorsFilter(source)); bean.setOrder(Ordered.HIGHEST_PRECEDENCE); return bean; } } }
 */
