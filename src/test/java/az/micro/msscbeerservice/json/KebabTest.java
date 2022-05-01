package az.micro.msscbeerservice.json;

import az.micro.msscbeerservice.web.model.BeerDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("kebab")
@JsonTest
public class KebabTest extends BaseTest{

    @Autowired
    ObjectMapper objectMapper;

    @Test
    public void kebabCaseTest () throws JsonProcessingException {
        BeerDto beerDto = getBeer();
        String value = objectMapper.writeValueAsString(beerDto);
        System.out.println(value);
    }

    @Test
    public void deserializeFromKebabCase () throws JsonProcessingException  {
        String json = "{\"id\":\"e00880c3-f12e-4e7f-a1e6-c02f4279c71c\",\"version\":1,\"created-date\":\"2022-05-02T02:44:36.2041433+04:00\",\"last-modified-date\":null,\"beer-name\":\"BeerName\",\"beer-style\":\"GOSE\",\"upc\":12345,\"price\":21.10000000000000142108547152020037174224853515625,\"quantity-on-hand\":null}\n";
        BeerDto beerDto = objectMapper.readValue(json, BeerDto.class);
        System.out.println(beerDto);
    }
}
