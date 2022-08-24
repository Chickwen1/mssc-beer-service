package sara.springframework.msscbeerservice.web.mappers;

import org.mapstruct.Mapper;
import sara.springframework.msscbeerservice.domain.Beer;
import sara.springframework.msscbeerservice.web.model.BeerDto;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);
    Beer beerDtoToBeer(BeerDto dto);
}
