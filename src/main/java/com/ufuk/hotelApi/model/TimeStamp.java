package com.ufuk.hotelApi.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class TimeStamp {

  @SerializedName(value = "from")
  private int from;

  @SerializedName(value = "to")
  private int to;

}
