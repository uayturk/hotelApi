package com.ufuk.hotelApi.controller;

import com.ufuk.hotelApi.model.BaseObject;
import com.ufuk.hotelApi.model.Hotels;
import com.ufuk.hotelApi.service.GetHotelsService;
import io.swagger.annotations.ApiOperation;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GetHotelsController {


  @Autowired
  private final GetHotelsService getHotelsService;

  public GetHotelsController(GetHotelsService getHotelsService) { this.getHotelsService = getHotelsService; }


 /* @RequestMapping(value = "/readAndSaveMongoDb", method = {RequestMethod.POST}, produces = "application/json")
  @ResponseBody
  @ApiOperation(value = "Doc is the below for readAndSaveMongoDb.\n",
      notes = "readAndSaveMongoDb send request and extracts necessary data.\n "
  )
  public Hotels readAndSaveMongoDb(@RequestParam(required = false) Integer page,@RequestParam(required = true) String checkInDate,@RequestParam(required = true) String checkOutDate,@RequestParam(required = true) Integer adultCount,@RequestParam(required = true,defaultValue="0") Integer childCount,@RequestParam(required = true,defaultValue="0") Integer childAge1,@RequestParam(required = true,defaultValue="0") Integer childAge2,@RequestParam(required = true,defaultValue="0") Integer childAge3) throws IOException, JSONException {
    return getHotelsService.readAndSaveMongoDb(page,checkInDate,checkOutDate,adultCount,childCount,childAge1,childAge2,childAge3);
  }*/

  @RequestMapping(value = "/readAndSaveMongoDb", method = {RequestMethod.POST}, produces = "application/json")
  @ResponseBody
  @ApiOperation(value = "Doc is the below for readAndSaveMongoDb.\n",
      notes = "readAndSaveMongoDb send request and extracts necessary data.\n "
  )
  public void readAndSaveMongoDb(@RequestParam(required = false) Integer page,@RequestParam(required = true) String checkInDate,@RequestParam(required = true) String checkOutDate,@RequestParam(required = true) Integer adultCount,@RequestParam(required = true,defaultValue="0") Integer childCount,@RequestParam(required = true,defaultValue="0") Integer childAge1,@RequestParam(required = true,defaultValue="0") Integer childAge2,@RequestParam(required = true,defaultValue="0") Integer childAge3) throws IOException, JSONException {
    getHotelsService.readAndSaveMongoDb(page,checkInDate,checkOutDate,adultCount,childCount,childAge1,childAge2,childAge3);
  }


  @RequestMapping(value = "/getAllHotels", method = {RequestMethod.POST}, produces = "application/json")
  @ResponseBody
  @ApiOperation(value = "Doc is the below for getAllHotels.\n",
      notes = "getAllHotels send request and extracts necessary data.\n "
  )
  public List<BaseObject> getAllHotels() throws IOException, JSONException {
    return getHotelsService.getAllHotels();
  }

  @RequestMapping(value = "/getHotelsByTown", method = {RequestMethod.POST}, produces = "application/json")
  @ResponseBody
  @ApiOperation(value = "Doc is the below for getHotelsByTown.\n",
      notes = "getHotelsByTown send request and extracts necessary data.\n "
  )
  public List<BaseObject> getHotelsByTown(@RequestParam(required = true) String town) throws IOException, JSONException {
    return getHotelsService.getHotelsByTown(town);
  }


}
