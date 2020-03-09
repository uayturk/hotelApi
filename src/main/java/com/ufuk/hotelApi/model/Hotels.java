package com.ufuk.hotelApi.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.Data;

@Data
public class Hotels {

  @SerializedName("hotels")
  private List<BaseObject> baseObjects;

  @SerializedName(value = "totalCount")
  private int totalCount;

  @SerializedName(value = "availableCount")
  private int availableCount;


}
