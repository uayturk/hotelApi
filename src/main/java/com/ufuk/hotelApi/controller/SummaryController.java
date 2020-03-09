package com.ufuk.hotelApi.controller;


import com.ufuk.hotelApi.service.GetHotelsService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SummaryController {

  @Autowired
  GetHotelsService getHotelsService;

  /*@RequestMapping(value = "/getInfosForUrlRequestFromFrontend", method = RequestMethod.POST)
  *//*@ResponseBody*//*  //if you not use this annotation,you get " javax.servlet.ServletException: Circular view path [...] "
  private String getAirportsForCountry(String selectedCountryName) {

    System.out.println("fffffffffffffffffff:" + selectedCountryName.replaceAll("\"", "").trim());


    return "redirect:/hotelApi";
  }*/

  @RequestMapping(value = "/hotelApi", method = RequestMethod.GET)
  public String summary(ModelMap modelMap) throws IOException {

    modelMap.addAttribute("summaryHotels", getHotelsService.getAllHotels());


    return "summary";

  }

}
