package com.ufuk.hotelApi.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class Address {

  @SerializedName(value = "address")
  private String address;

  @SerializedName(value = "zipCode")
  private String zipCode;

  @SerializedName(value = "country")
  private String country;

  @SerializedName(value = "countryCode")
  private String countryCode;

  @SerializedName(value = "town")
  private String town;

  @SerializedName(value = "city")
  private String city;

}
