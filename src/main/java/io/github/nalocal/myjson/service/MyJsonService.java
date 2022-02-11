package io.github.nalocal.myjson.service;

import com.alibaba.fastjson.JSON;

public class MyJsonService {
  // 字首
  private String prefixName;
  // 字尾
  private String suffixName;

  /**
   * 將Java物件轉為帶有指定前字尾的JSON字串
   *
   * @param o 需要轉換的Java物件
   * @return 轉換後的字串
   */
  public String objectToMyJson(Object o) {
    return prefixName + JSON.toJSONString(o) + suffixName;
  }

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
