package trkck.mssc.brewery.services;

import trkck.mssc.brewery.web.model.BeerDto;
import trkck.mssc.brewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID uuid);

    BeerDto saveNewBeer(BeerDtoV2 beerDto);

    void update(UUID beerId, BeerDtoV2 beerDto);

    void deleteById();
}
