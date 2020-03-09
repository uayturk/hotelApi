package com.ufuk.hotelApi.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class Extra {

  @SerializedName(value = "image_count")
  private String image_count;

  @SerializedName(value = "thumbnailImage")
  private String thumbnailImage;

}
