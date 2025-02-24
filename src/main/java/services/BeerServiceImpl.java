package services;

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
}
