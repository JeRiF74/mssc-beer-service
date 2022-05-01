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
}
