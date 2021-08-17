package com.example.isolatingdomainsample.domain.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

/**
 * メールアドレス
 */
public class MailAddress {

  @NotBlank(message = "メールアドレスを入力してください")
  @Email(message = "メールアドレスが正しくありません。")
  private String value = "";

  public MailAddress() {
  }

  public MailAddress(String mailAddress) {
    this.value = mailAddress;
  }

  @Override
  public String toString() {
    return value;
  }
}
