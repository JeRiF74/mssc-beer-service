package az.micro.msscbeerservice.web.controller;

import az.micro.msscbeerservice.service.BeerService;
import az.micro.msscbeerservice.web.model.BeerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RequiredArgsConstructor
@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    private final BeerService beerService;

    @GetMapping("/{beerId}")
    public ResponseEntity getBeerById (@PathVariable UUID beerId) {
        return new ResponseEntity(beerService.getById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewBeer (@Valid @RequestBody BeerDto beerDto) {
        return new ResponseEntity(beerService.saveNewBeer(beerDto), HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeer (@PathVariable UUID beerId ,@Valid @RequestBody BeerDto beerDto) {
        return new ResponseEntity(beerService.updateBeer(beerId,beerDto),HttpStatus.NO_CONTENT);
    }

}
