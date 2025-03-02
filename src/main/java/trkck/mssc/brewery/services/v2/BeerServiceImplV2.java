package trkck.mssc.brewery.services.v2;

import org.springframework.stereotype.Service;
import trkck.mssc.brewery.web.model.BeerDto;
import trkck.mssc.brewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

@Service
public class BeerServiceImplV2 implements BeerServiceV2{
    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return null;
    }

    @Override
    public BeerDto saveNewBeer(BeerDtoV2 beerDto) {
        return null;
    }

    @Override
    public void update(UUID beerId, BeerDtoV2 beerDto) {

    }

    @Override
    public void deleteById() {

    }
}
