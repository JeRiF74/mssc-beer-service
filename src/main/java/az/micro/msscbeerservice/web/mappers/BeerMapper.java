package az.micro.msscbeerservice.web.mappers;

import az.micro.msscbeerservice.domain.Beer;
import az.micro.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;


@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto (Beer beer);

    Beer beerDtoToBeer (BeerDto beerDto);
}
