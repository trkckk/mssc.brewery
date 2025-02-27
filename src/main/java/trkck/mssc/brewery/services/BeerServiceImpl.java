package trkck.mssc.brewery.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import trkck.mssc.brewery.web.model.BeerDto;

import java.util.UUID;
@Slf4j
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

    @Override
    public void deleteById() {
        log.debug("deleting a beer...");
    }
}
