package az.micro.msscbeerservice.service;

import az.micro.msscbeerservice.web.model.BeerDto;
import az.micro.msscbeerservice.web.model.BeerPagedList;
import az.micro.msscbeerservice.web.model.BeerStyleEnum;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

public interface BeerService {


    BeerPagedList listBeers(String beerName, BeerStyleEnum beerStyle, PageRequest pageRequest);

    BeerDto getById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto updateBeer(UUID beerId , BeerDto beerDto);
}
