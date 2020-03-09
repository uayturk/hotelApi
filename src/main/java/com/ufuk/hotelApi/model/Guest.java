package com.ufuk.hotelApi.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class Guest {

  @SerializedName(value = "adults")
  private int adults;

  @SerializedName(value = "children")
  private int children;


}
