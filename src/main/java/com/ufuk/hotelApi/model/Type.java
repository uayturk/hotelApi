package com.ufuk.hotelApi.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class Type {

  @SerializedName(value = "id")
  private String id;

  @SerializedName(value = "name")
  private String name;

  @SerializedName(value = "typeCode")
  private String typeCode;

  @SerializedName(value = "characteristicCode")
  private String characteristicCode;

}
