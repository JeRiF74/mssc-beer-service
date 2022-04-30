package az.micro.msscbeerservice.web.controller;

import az.micro.msscbeerservice.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;


@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity getBeerById (@PathVariable UUID beerId) {

        return new ResponseEntity(BeerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewBeer (@RequestBody @Validated BeerDto beerDto) {

        return new ResponseEntity(BeerDto.builder().build() , HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeer (@PathVariable UUID beerId , @RequestBody @Validated BeerDto beerDto) {

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

}
