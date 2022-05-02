package az.micro.msscbeerservice.web.mappers;

import az.micro.msscbeerservice.domain.Beer;
import az.micro.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;
import org.mapstruct.DecoratedWith;


@Mapper(uses = {DateMapper.class})
@DecoratedWith(BeerMapperDecorator.class)
public interface BeerMapper {

    BeerDto beerToBeerDto (Beer beer);

    Beer beerDtoToBeer (BeerDto beerDto);
}
