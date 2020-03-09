package com.ufuk.hotelApi.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class Concept {

  @SerializedName(value = "code")
  private String code;

  @SerializedName(value = "description")
  private String description;

  @SerializedName(value = "parentCode")
  private String parentCode;

}
