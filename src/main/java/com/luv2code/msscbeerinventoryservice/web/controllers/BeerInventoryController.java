package com.luv2code.msscbeerinventoryservice.web.controllers;

import com.luv2code.msscbeerinventoryservice.repositories.BeerInventoryRepository;
import com.luv2code.msscbeerinventoryservice.web.mappers.BeerInventoryMapper;
import com.luv2code.msscbeerinventoryservice.web.model.BeerInventoryDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * @author Jack Tran
 */
@RestController
@RequiredArgsConstructor
@Slf4j
public class BeerInventoryController {

    private final BeerInventoryRepository beerInventoryRepository;
    private final BeerInventoryMapper beerInventoryMapper;

    @GetMapping("api/v1/beer/{beerId}/inventory")
    List<BeerInventoryDto> listBeerById(@PathVariable UUID beerId) {
        log.debug("Finding Inventory for beerId: " + beerId);

        return beerInventoryRepository.findAllByBeerId(beerId)
                .stream()
                .map(beerInventoryMapper::beerInventoryToBeerInventoryDto)
                .collect(Collectors.toList());
    }
}
