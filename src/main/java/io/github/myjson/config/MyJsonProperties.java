package io.github.myjson.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "smile.json")
public class MyJsonProperties {

  // Starter使用者沒在配置檔案中配置prefixName屬性的值時的預設值
  public static final String DEFAULT_PREFIX_NAME = "@";

  // Starter使用者沒在配置檔案中配置suffixName屬性的值時的預設值
  public static final String DEFAULT_SUFFIX_NAME = "@";

  private String prefixName = DEFAULT_PREFIX_NAME;

  private String suffixName = DEFAULT_SUFFIX_NAME;

  public String getPrefixName() {
    return prefixName;
  }

  public void setPrefixName(String prefixName) {
    this.prefixName = prefixName;
  }

  public String getSuffixName() {
    return suffixName;
  }

  public void setSuffixName(String suffixName) {
    this.suffixName = suffixName;
  }
}
