package com.ufuk.hotelApi.service.impl;

import static org.springframework.data.mongodb.core.query.Criteria.where;

import com.google.gson.Gson;
import com.ufuk.hotelApi.beans.CollectionNames;
import com.ufuk.hotelApi.model.BaseObject;
import com.ufuk.hotelApi.model.Hotels;
import com.ufuk.hotelApi.service.GetHotelsService;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class GetHotelsServiceImpl implements GetHotelsService {

  private final MongoTemplate mongoTemplate;

  @Autowired
  GetHotelsService getHotelsService;

  private int flag = 0;
  private int reqCount = 0;

  public GetHotelsServiceImpl(MongoTemplate mongoTemplate) {
    this.mongoTemplate = mongoTemplate;
  }


/*  public void getHotels() throws IOException, JSONException {


    String url = "https://otel.enuygun.com/otel/async-result?page=1&sortBy=2&checkInDate=10.03.2020&checkOutDate=13.03.2020&rooms=2&query=sanliurfa-3133&hotel=&limit=1&ffr=1&p=search&ref=search";
    URL obj = new URL(url);
    HttpURLConnection con = (HttpURLConnection) obj.openConnection();

    int responseCode = con.getResponseCode();
    System.out.println("\nSending 'POST' request to URL : " + url);
    System.out.println("Response Code : " + responseCode);
    BufferedReader in = new BufferedReader(
        new InputStreamReader(con.getInputStream()));


    *//*FileReader fr = new FileReader("/home/ufuk/Masaüstü/hotelApiTestData");
    BufferedReader in = new BufferedReader(fr);*//*

    String inputLine;
    StringBuffer response = new StringBuffer();
    while ((inputLine = in.readLine()) != null) {
      response.append(inputLine);
    }
    in.close();


    String parts[] = response.substring(response.lastIndexOf("resultdata:") + 12).split("event: closedata: null");
    System.out.println("DDDDDDDDDDDDDDDDDDDD" + response.substring(response.lastIndexOf("resultdata:") + 12));

    System.out.println("DDDDDDDDDDDDDDDDDDDD fileleeeee" + parts[0]);

    Gson gson = new Gson();
    Hotels baseObjects = gson.fromJson(parts[0], Hotels.class);//Converting JSON to Java Object. From response.toString() (JSON) to List.class(JAVA OBJECT)
    for (BaseObject o : baseObjects.getBaseObjects()) {
      String jsonObject = gson.toJson(o); //Converting our Object type to JSON type.
      BaseObject baseObject = gson.fromJson(jsonObject, BaseObject.class);//Converting our JSON type to baseobject type.In here,our datas are filled in Baseobject fields.
      //From jsonObject(JSON) to BaseObject.class(BaseObject type)
      log.info("trying to save hotels object: {}", baseObject);
      mongoTemplate.save(baseObject, CollectionNames.OBJECTS.toString());
      log.info("successfully saved weather object with Id:{}", baseObject.getId());

      System.out.println(baseObject);

    }

  }*/
        //Hotels  void yerine. Eğer dataları döndürmek istiyorsak.
  public void readAndSaveMongoDb(Integer page,String checkInDate,String checkOutDate,Integer adultCount,Integer childCount,Integer childAge1,Integer childAge2,Integer childAge3) throws IOException,JSONException {
    log.info("trying to get hotels from url.");

    String url="";
    if(childCount == 0){
      System.out.println("No Child URL" );
      url = "https://otel.enuygun.com/otel/async-result?page="+page+"&sortBy=2&checkInDate="+checkInDate+"&checkOutDate="+checkOutDate+"&rooms="+adultCount+"&query=antalya-481&hotel=&limit=50&ffr=1&p=search&ref=search";
    }else{
      System.out.println("With Child URL" );
      if(childCount == 1){
        System.out.println("1 Child Available hotels URL" );
        url = "https://otel.enuygun.com/otel/async-result?page="+page+"&sortBy=2&checkInDate="+checkInDate+"&checkOutDate="+checkOutDate+"&rooms="+adultCount+"%2C"+childAge1+"&query=antalya-481&hotel=&limit=50&ffr=1&p=search&ref=search";
      }else if(childCount == 2){
        System.out.println("2 Child Available hotels URL" );
        url = "https://otel.enuygun.com/otel/async-result?page="+page+"&sortBy=2&checkInDate="+checkInDate+"&checkOutDate="+checkOutDate+"&rooms="+adultCount+"%2C"+childAge1+"%2C"+childAge2+"&query=antalya-481&hotel=&limit=50&ffr=1&p=search&ref=search";
      }else if(childCount == 3){
        System.out.println("3 Child Available hotels URL" );
        url = "https://otel.enuygun.com/otel/async-result?page="+page+"&sortBy=2&checkInDate="+checkInDate+"&checkOutDate="+checkOutDate+"&rooms="+adultCount+"%2C"+childAge1+"%2C"+childAge2+"%2C"+childAge3+"&query=antalya-481&hotel=&limit=50&ffr=1&p=search&ref=search";
      }


    }
    URL obj = new URL(url);
    HttpURLConnection con = (HttpURLConnection) obj.openConnection();

    int responseCode = con.getResponseCode();
    System.out.println("\nSending 'POST' request to URL : " + url);
    System.out.println("Response Code : " + responseCode);
    BufferedReader in = new BufferedReader(
        new InputStreamReader(con.getInputStream()));


    /*FileReader fr = new FileReader("/home/ufuk/Masaüstü/hotelApiTestData");
    BufferedReader in = new BufferedReader(fr);*/

    String inputLine;
    StringBuffer response = new StringBuffer();
    while ((inputLine = in.readLine()) != null) {
      response.append(inputLine);
    }
    in.close();

    String hotelResults[] = response.substring(response.lastIndexOf("resultdata:") + 12).split("event: closedata: null");
    System.out.println("DDDDDDDDDDDDDDDDDDDD" + response.substring(response.lastIndexOf("resultdata:") + 12));

    System.out.println("DDDDDDDDDDDDDDDDDDDD fileleeeee" + hotelResults[0]);

    Gson gson = new Gson();
    Hotels baseObjects = gson.fromJson(hotelResults[0], Hotels.class);//Converting JSON to Java Object. From response.toString() (JSON) to List.class(JAVA OBJECT)
    for (BaseObject o : baseObjects.getBaseObjects()) {
      String jsonObject = gson.toJson(o); //Converting our Object type to JSON type.
      BaseObject baseObject = gson.fromJson(jsonObject, BaseObject.class);//Converting our JSON type to baseobject type.In here,our datas are filled in Baseobject fields.
      //From jsonObject(JSON) to BaseObject.class(BaseObject type)
      log.info("trying to save hotels object: {}", baseObject);
      mongoTemplate.save(baseObject, CollectionNames.OBJECTS.toString());
      log.info("successfully saved weather object with Id:{}", baseObject.getId());
      reqCount++;
      System.out.println(baseObject);

    }


    System.out.println("Available count : " + baseObjects.getAvailableCount());
    //System.out.println("Divide count : " + requestCount);
    System.out.println("Mod count : " + (baseObjects.getAvailableCount()%50));


    //When we call method like below recursively, "for" condition is run only once thanks to the flag.
    if(flag == 0){
      //requestCount = (baseObjects.getAvailableCount()/50);
      //requestCount = 3;
      flag ++;

      System.out.println("Available count divideeeee : " + (baseObjects.getAvailableCount()/50));
      for(int i = 0; i<=(baseObjects.getAvailableCount()/50); i++){
        reqCount++;
        System.out.println("REEEEEQQQQQQQQQQCCCOOUUUUUUNNNTTTTT : " + reqCount );
        readAndSaveMongoDb(page++,checkInDate,checkOutDate,adultCount,childCount,childAge1,childAge2,childAge3);
      }
    }
    System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa : " + baseObjects );
     //return baseObjects;
  }


  public List<BaseObject> getAllHotels(){

    List<BaseObject> result = mongoTemplate.findAll(BaseObject.class,CollectionNames.OBJECTS.toString());
    log.info("successfully fetched result size: {}", result.size());
    log.info("FINALLY RESULT HOTELS: {}", result);
    return result;
  }

  public List<BaseObject> getHotelsByTown(String town){

    log.info("trying to get hotels for town {}.",town);
    Query query = new Query(where("details.address.town").is(town));

    List<BaseObject> result = mongoTemplate.find(query,BaseObject.class,CollectionNames.OBJECTS.toString());
    log.info("successfully fetched result size: {}", result.size());
    log.info("FINALLY RESULT HOTELS FOR TOWN: {}", result);
    return result;
  }

}


// https://codepen.io/smfoisal/pen/bjJqxL    nice datepicker