package com.luv2code.msscbeerinventoryservice.repositories;

import com.luv2code.msscbeerinventoryservice.domain.BeerInventory;
import com.luv2code.msscbeerinventoryservice.web.model.BeerInventoryDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

/**
 * @author Jack Tran
 */
public interface BeerInventoryRepository extends JpaRepository<BeerInventory, UUID> {
    List<BeerInventory> findAllByBeerId(UUID beerId);
}
