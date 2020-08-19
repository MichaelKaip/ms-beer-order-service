package mk.microservices.springframework.msbeerorderservice.web.mappers;

import mk.microservices.springframework.msbeerorderservice.domain.BeerOrderLine;
import mk.microservices.springframework.msbeerorderservice.web.model.BeerOrderLineDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerOrderLineMapper {

    BeerOrderLineDto beerOrderLineToDto(BeerOrderLine line);

    BeerOrderLine dtoToBeerOrderLine(BeerOrderLineDto dto);
}