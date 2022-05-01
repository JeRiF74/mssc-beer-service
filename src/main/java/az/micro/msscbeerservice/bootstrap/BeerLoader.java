package az.micro.msscbeerservice.bootstrap;

import az.micro.msscbeerservice.domain.Beer;
import az.micro.msscbeerservice.repos.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {

    public static final String BEER_1_UPC = "0631234200036";
    public static final String BEER_2_UPC = "0631234300019";
    public static final String BEER_3_UPC = "0083783375213";


    private BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {
        if (beerRepository.count()==0) {
            beerRepository.save(Beer.builder()
                    .beerName("Kozel")
                            .beerStyle("IPA")
                            .quantityToBrew(200)
                            .upc(BEER_1_UPC)
                            .minOnHand(12)
                            .price(new BigDecimal(22.50))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Galaxy cat")
                    .beerStyle("IPA")
                    .quantityToBrew(300)
                    .upc(BEER_2_UPC)
                    .minOnHand(15)
                    .price(new BigDecimal(25.50))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("HAMMER")
                    .beerStyle("IPA")
                    .quantityToBrew(300)
                    .upc(BEER_3_UPC)
                    .minOnHand(15)
                    .price(new BigDecimal(20.50))
                    .build());
        }
    }



}
