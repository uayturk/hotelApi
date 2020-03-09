package com.ufuk.hotelApi.beans;

import lombok.Getter;

/**
 * Keeps collection names, don't use {@link Enum#name()} use {@link CollectionNames#toString()} instead.
 */
@Getter
public enum CollectionNames {

  OBJECTS("hotelsCollection");

  private String collectionName;

  CollectionNames(String collectionName) {
    this.collectionName = collectionName;
  }

  @Override
  public String toString() {
    return collectionName;
  }
}

