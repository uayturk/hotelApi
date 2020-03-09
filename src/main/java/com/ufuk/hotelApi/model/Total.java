package com.ufuk.hotelApi.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class Total {

  @SerializedName(value = "amount")
  private double amount;

  @SerializedName(value = "currency")
  private String currency;


}
