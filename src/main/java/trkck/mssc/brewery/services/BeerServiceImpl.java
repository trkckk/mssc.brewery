package trkck.mssc.brewery.services;

import org.springframework.stereotype.Service;
import trkck.mssc.brewery.web.model.BeerDto;

import java.util.UUID;
@Service
public class BeerServiceImpl implements BeerService {


    @Override
    public BeerDto getBeerById(UUID uuid) {

        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder().id(UUID.randomUUID())
                .build();
    }

    @Override
    public void update(UUID beerId, BeerDto beerDto) {
        // to do impl would a real impl to update beer

    }
}
