package com.ufuk.hotelApi.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class RoomClass {

  @SerializedName(value = "code")
  private String code;

  @SerializedName(value = "description")
  private String description;

  @SerializedName(value = "refundable")
  private boolean refundable;

  @SerializedName(value = "promotion")
  private boolean promotion;

  @SerializedName(value = "package")
  private boolean packages;

  @SerializedName(value = "offer")
  private boolean offer;

}
