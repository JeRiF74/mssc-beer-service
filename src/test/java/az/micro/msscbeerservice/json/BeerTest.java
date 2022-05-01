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
}