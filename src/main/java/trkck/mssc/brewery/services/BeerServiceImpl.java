package trkck.mssc.brewery.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import trkck.mssc.brewery.web.model.BeerDto;
import trkck.mssc.brewery.web.model.v2.BeerDtoV2;

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
    public BeerDto saveNewBeer(BeerDtoV2 beerDto) {
        return BeerDto.builder().id(UUID.randomUUID())
                .build();
    }

    @Override
    public void update(UUID beerId, BeerDtoV2 beerDto) {
        // to do impl would a real impl to update beer

    }

    @Override
    public void deleteById() {
        log.debug("deleting a beer...");
    }
}
