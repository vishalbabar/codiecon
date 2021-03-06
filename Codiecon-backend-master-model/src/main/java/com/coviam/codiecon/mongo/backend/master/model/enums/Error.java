package com.coviam.codiecon.mongo.backend.master.model.enums;

/**
 * Created by Vishal B on Oct, 2018
 */

public enum Error {

  CURRENCY_ID_NULL("currency id is null"),
  CURRENCY_NOT_FOUND("currency not found"),
  USER_EXISTS("user already exists"),
  USER_NOT_FOUND("user not found"),
  FOLLOWERS_EXISTS("follower exists"),

  // others
  SYSTEM_ERROR("Internal system error");

  private String message;

  Error(String message) {
    this.message = message;
  }

  public String getCode() {
    return this.name();
  }

  public String getMessage() {
    return this.message;
  }
}
