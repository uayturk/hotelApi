package com.ufuk.hotelApi.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.Data;

@Data
public class Rooms {

  @SerializedName(value = "reference")
  private String reference;

  @SerializedName("type")
  private Type type;

  @SerializedName("images")
  private List<String> images;

  @SerializedName("offers")
  private List<Offers> offers;

  @SerializedName("facilities")
  private List<String> facilities;

  @SerializedName("information")
  private List<String> information;

  @SerializedName("alerts")
  private List<String> alerts;

  @SerializedName(value = "description")
  private String description;

}
