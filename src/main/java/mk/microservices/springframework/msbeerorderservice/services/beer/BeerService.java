package mk.microservices.springframework.msbeerorderservice.services.beer;

import mk.microservices.springframework.msbeerorderservice.web.model.BeerDto;

import java.util.Optional;
import java.util.UUID;

public interface BeerService {

    Optional<BeerDto> getBeerById(UUID uuid);

    Optional<BeerDto> getBeerByUpc(String upc);
}
