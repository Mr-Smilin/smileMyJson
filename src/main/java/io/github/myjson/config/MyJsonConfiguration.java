package io.github.myjson.config;

import io.github.myjson.service.MyJsonService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 標識此類是配置類
@ConditionalOnClass(MyJsonService.class) // 表示只有指定的class在classpath上時才能被註冊
@EnableConfigurationProperties(MyJsonProperties.class) // 啟用@ConfigurationProperties
public class MyJsonConfiguration {

  private MyJsonProperties myJsonProperties;

  // 自動注入配置類
  public MyJsonConfiguration(MyJsonProperties myJsonProperties) {
    this.myJsonProperties = myJsonProperties;
  }

  // 建立MyJsonService物件，注入到Spring容器中
  @Bean
  @ConditionalOnMissingBean(MyJsonService.class)
  public MyJsonService myJsonService() {
    MyJsonService myJsonService = new MyJsonService();
    myJsonService.setPrefixName(myJsonProperties.getPrefixName());
    myJsonService.setSuffixName(myJsonProperties.getSuffixName());
    return myJsonService;
  }
}
