package com.ufuk.hotelApi.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class DiscountTags {

  @SerializedName(value = "tag")
  private String tag;

  @SerializedName(value = "discountString")
  private String discountString;

  @SerializedName(value = "label")
  private String label;

}
