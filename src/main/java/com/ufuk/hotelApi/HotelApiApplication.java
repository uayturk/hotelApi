package com.ufuk.hotelApi;


import com.ufuk.hotelApi.config.ApplicationConfig;
import java.time.LocalDate;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@EnableAutoConfiguration
//@Configuration
//@ComponentScan
@SpringBootApplication
@EnableSwagger2
@EnableScheduling
public class HotelApiApplication {

  private final ApplicationConfig applicationConfig;

  @Autowired
  public HotelApiApplication(ApplicationConfig applicationConfig) { this.applicationConfig = applicationConfig; }

  public static void main(String[] args) {
    SpringApplication.run(HotelApiApplication.class,args);

   /* String message2 = "[Rooms(reference&#x3D;DBL.LV, type&#x3D;Type(id&#x3D;null, name&#x3D;1 Çift Kişilik Yatak Kara Manzaralı, typeCode&#x3D;DBL, characteristicCode&#x3D;LV), images&#x3D;[], offers&#x3D;[Offers(hash&#x3D;1210514792af, price&#x3D;Price(total&#x3D;Total(amount&#x3D;42321.0, currency&#x3D;TRY)), concept&#x3D;Concept(code&#x3D;BB, description&#x3D;Oda Kahvaltı, parentCode&#x3D;null), roomClass&#x3D;RoomClass(code&#x3D;NRF, description&#x3D;Normal, refundable&#x3D;true, promotion&#x3D;false, packages&#x3D;false, offer&#x3D;false), refundableExpireDate&#x3D;2020-03-23T21:59:00+00:00, cancellationRules&#x3D;[CancellationRules(timeStamp&#x3D;TimeStamp(from&#x3D;0, to&#x3D;1585000740), price&#x3D;null), CancellationRules(timeStamp&#x3D;TimeStamp(from&#x3D;1585000740, to&#x3D;0), price&#x3D;Total(amount&#x3D;423.21, currency&#x3D;TRY))], alerts&#x3D;[], allotment&#x3D;1, information&#x3D;[Erken Rezervasyon İndirimi], guest&#x3D;Guest(adults&#x3D;2, children&#x3D;0), provider&#x3D;2, offerType&#x3D;TOTAL, isSaleable&#x3D;true, needsCheck&#x3D;false, needsCheckBeforeBooking&#x3D;false, sourceOfferType&#x3D;TOTAL, discountFrom&#x3D;Total(amount&#x3D;46821.0, currency&#x3D;TRY), discountTags&#x3D;[DiscountTags(tag&#x3D;discount, discountString&#x3D;%9, label&#x3D;İndirim)], isCheapestOffer&#x3D;false, buttonMessages&#x3D;[])], facilities&#x3D;[], information&#x3D;[], alerts&#x3D;[], description&#x3D;null)]";
    String[] result = message2.substring(message2.lastIndexOf("name&#x3D;")+10).split(", typeCode&#x3D");
    System.out.println("RESULT : " + result[0]);*/
  }

  @Bean
  Docket swaggerSpringMvcPlugin() {
    return new Docket(DocumentationType.SWAGGER_2)
        .apiInfo(apiInfo())
        .directModelSubstitute(LocalDateTime.class, String.class)
        .directModelSubstitute(LocalDate.class, String.class)
        .select().apis(RequestHandlerSelectors.basePackage("com.ufuk"))
        .build();
  }

  private ApiInfo apiInfo() {
    return new ApiInfoBuilder()
        .title(applicationConfig.getApplicationName())
        .description("<i>Current platform: </i><b>" + applicationConfig.getPlatform() + "</b>")
        .version(applicationConfig.getBuildVersion())
        .build();
  }
}
