package com.example.isolatingdomainsample.domain.model.employee;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * 氏名
 */
public class Name {

  final int 字数制限 = 40;

  @NotBlank(message = "名前を入力してください。")
  @Size(max = 字数制限, message = "{max}文字以内で入力してください。")
  private String value = "";

  public Name() {
  }

  public Name(String name) {
    this.value = name;
  }

  @Override
  public String toString() {
    return value;
  }
}
