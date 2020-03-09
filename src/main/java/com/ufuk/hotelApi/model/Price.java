package com.ufuk.hotelApi.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class Price {

  @SerializedName(value = "total")
  private Total total;

}
