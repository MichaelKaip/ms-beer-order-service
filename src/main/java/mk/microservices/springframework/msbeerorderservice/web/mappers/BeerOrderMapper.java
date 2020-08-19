package mk.microservices.springframework.msbeerorderservice.web.mappers;

import mk.microservices.springframework.msbeerorderservice.domain.BeerOrder;
import mk.microservices.springframework.msbeerorderservice.web.model.BeerOrderDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class, BeerOrderLineMapper.class})
public interface BeerOrderMapper {

    BeerOrderDto beerOrderToDto(BeerOrder beerOrder);

    BeerOrder dtoToBeerOrder(BeerOrderDto dto);
}
