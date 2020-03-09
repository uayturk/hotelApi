package com.ufuk.hotelApi.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "hotelCollection")
public class BaseObject {

  @SerializedName(value = "id")
  private String id;

  @SerializedName(value = "details")
  private Details details;

  @SerializedName(value = "rooms")
  private List<Rooms> rooms;

  @SerializedName(value = "cached")
  private boolean cached;

  @SerializedName(value = "df")
  private boolean df;

  @SerializedName(value = "fc")
  private boolean fc;


}
