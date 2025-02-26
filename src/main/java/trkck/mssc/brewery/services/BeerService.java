package trkck.mssc.brewery.services;

import trkck.mssc.brewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID uuid);

    BeerDto saveNewBeer(BeerDto beerDto);
}
