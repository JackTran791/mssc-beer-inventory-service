package com.luv2code.msscbeerinventoryservice.web.mappers;

import com.luv2code.msscbeerinventoryservice.domain.BeerInventory;
import com.luv2code.msscbeerinventoryservice.web.model.BeerInventoryDto;
import org.mapstruct.Mapper;

/**
 * @author Jack Tran
 */
@Mapper(uses = {DateMapper.class})
public interface BeerInventoryMapper {

    BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDto);

    BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory);
}
