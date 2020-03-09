package com.ufuk.hotelApi.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.Data;

@Data
public class Details {

  @SerializedName(value = "slug")
  private String slug;

  @SerializedName(value = "extra")
  private Extra extra;

  @SerializedName(value = "address")
  private Address address;

  @SerializedName(value = "coordinate")
  private Coordinate coordinate;

  @SerializedName(value = "description")
  private String description;

  @SerializedName("facilities")
  private List<String> facilities;

  @SerializedName("suitabilities")
  private List<String> suitabilities;

  @SerializedName(value = "name")
  private String name;

  @SerializedName("images")
  private List<String> images;

  @SerializedName(value = "starRating")
  private int starRating;

  @SerializedName(value = "reviewScore")
  private Double reviewScore;

  @SerializedName("reviews")
  private List<String> reviews;

  @SerializedName(value = "tripAdvisorScore")
  private Double tripAdvisorScore;

  @SerializedName(value = "tripAdvisorReviewCount")
  private int tripAdvisorReviewCount;

  @SerializedName(value = "tripAdvisorScoreLocalized")
  private String tripAdvisorScoreLocalized;

  @SerializedName(value = "previewDescription")
  private String previewDescription;

  @SerializedName(value = "reviewScoreLocalized")
  private String reviewScoreLocalized;

  @SerializedName(value = "checkInTime")
  private String checkInTime;

  @SerializedName(value = "checkOutTime")
  private String checkOutTime;

  @SerializedName(value = "reviewsTotalCount")
  private int reviewsTotalCount;


}
