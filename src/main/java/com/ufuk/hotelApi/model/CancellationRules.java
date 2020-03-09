package com.ufuk.hotelApi.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class CancellationRules {

  @SerializedName(value = "timeStamp")
  private TimeStamp timeStamp;

  @SerializedName(value = "price")
  private Total price;


}
