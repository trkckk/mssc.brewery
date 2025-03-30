package trkck.mssc.brewery.web.mappers;

import org.mapstruct.Mapper;
import trkck.mssc.brewery.domain.Beer;
import trkck.mssc.brewery.web.model.BeerDto;

//@Mapper
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
