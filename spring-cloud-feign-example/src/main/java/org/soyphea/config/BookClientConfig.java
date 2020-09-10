package org.soyphea.config;

import feign.Logger;
import feign.Logger.Level;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;

public class BookClientConfig {

  @Bean
  Logger.Level feignLoggerLevel() {
    return Level.FULL;
  }

  @Bean
  public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
    return new BasicAuthRequestInterceptor("myuser", "@Password");
  }

}
