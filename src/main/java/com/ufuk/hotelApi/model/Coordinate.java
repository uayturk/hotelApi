package com.ufuk.hotelApi.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class Coordinate {

  @SerializedName(value = "latitude")
  private Double latitude;

  @SerializedName(value = "longitude")
  private Double longitude;

}
