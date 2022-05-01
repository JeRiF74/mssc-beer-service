package az.micro.msscbeerservice.json;

import az.micro.msscbeerservice.web.model.BeerDto;
import az.micro.msscbeerservice.web.model.BeerStyleEnum;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;


import static org.junit.jupiter.api.Assertions.*;

@JsonTest
class BeerTest extends BaseTest{

    @Autowired
    ObjectMapper objectMapper;

    @Test
    public void testSerialization () throws JsonProcessingException {
        String json = objectMapper.writeValueAsString(getBeer());
        assertNotNull(json);
        System.out.println(json);
    }

    @Test
    public void deserializeJson () throws JsonProcessingException {
        BeerDto beerDto = objectMapper.readValue("{\"id\":\"96b5b49b-2f97-490d-aa5c-63013c45f512\",\"version\":1,\"createdDate\":\"2022-05-02T01:31:07.5497042+04:00\",\"lastModifiedDate\":null,\"beerName\":\"BeerName\",\"beerStyle\":\"GOSE\",\"upc\":12345,\"price\":21.10000000000000142108547152020037174224853515625,\"quantityOnHand\":null}\n",BeerDto.class);
        assertNotNull(beerDto);
        System.out.println(beerDto);
    }
}