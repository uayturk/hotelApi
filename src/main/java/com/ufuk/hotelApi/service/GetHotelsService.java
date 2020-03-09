package com.ufuk.hotelApi.service;

import com.ufuk.hotelApi.model.BaseObject;
import com.ufuk.hotelApi.model.Hotels;
import java.io.IOException;
import java.util.List;

public interface GetHotelsService {

  //Hotels getAllHotels(Integer page,String checkInDate,String checkOutDate,Integer adultCount,Integer childCount,Integer childAge1,Integer childAge2,Integer childAge3) throws IOException;
  void readAndSaveMongoDb(Integer page,String checkInDate,String checkOutDate,Integer adultCount,Integer childCount,Integer childAge1,Integer childAge2,Integer childAge3) throws IOException;

  List<BaseObject> getAllHotels();

  List<BaseObject> getHotelsByTown(String town);
}
