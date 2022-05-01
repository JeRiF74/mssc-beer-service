package az.micro.msscbeerservice.json;


import az.micro.msscbeerservice.web.model.BeerDto;
import az.micro.msscbeerservice.web.model.BeerStyleEnum;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

public class BaseTest {

    BeerDto getBeer () {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("BeerName")
                .beerStyle(BeerStyleEnum.GOSE)
                .price(new BigDecimal(21.10))
                .upc(12345L)
                .createdDate(OffsetDateTime.now())
                .version(1)
                .build();
    }
}
