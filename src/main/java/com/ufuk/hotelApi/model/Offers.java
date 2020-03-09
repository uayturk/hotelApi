package com.ufuk.hotelApi.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.Data;

@Data
public class Offers {

  @SerializedName(value = "hash")
  private String hash;

  @SerializedName(value = "price")
  private Price price;

  @SerializedName(value = "concept")
  private Concept concept;

  @SerializedName(value = "roomClass")
  private RoomClass roomClass;

  @SerializedName(value = "refundableExpireDate")
  private String refundableExpireDate;

  @SerializedName(value = "cancellationRules")
  private List<CancellationRules> cancellationRules;

  @SerializedName("alerts")
  private List<String> alerts;

  @SerializedName(value = "allotment")
  private int allotment;

  @SerializedName("information")
  private List<String> information;

  @SerializedName("guest")
  private Guest guest;

  @SerializedName(value = "provider")
  private int provider;

  @SerializedName(value = "offerType")
  private String offerType;

  @SerializedName(value = "isSaleable")
  private boolean isSaleable;

  @SerializedName(value = "needsCheck")
  private boolean needsCheck;

  @SerializedName(value = "needsCheckBeforeBooking")
  private boolean needsCheckBeforeBooking;

  @SerializedName(value = "sourceOfferType")
  private String sourceOfferType;

  @SerializedName(value = "discountFrom")
  private Total discountFrom;

  @SerializedName("discountTags")
  private List<DiscountTags> discountTags;

  @SerializedName(value = "isCheapestOffer")
  private String isCheapestOffer;

  @SerializedName("buttonMessages")
  private List<String> buttonMessages;


}
