package com.collegeplacement.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.collegeplacement.entity.PlacementManagement;
import com.collegeplacement.service.PlacementManagementService;

@RestController
@RequestMapping("/placementmanagement")
@CrossOrigin
public class PlacementManagementController {

    private final PlacementManagementService service;

    public PlacementManagementController(PlacementManagementService service) {
        this.service = service;
    }

    @PostMapping
    public PlacementManagement addPlacement(
            @RequestBody PlacementManagement placement) {
        return service.savePlacement(placement);
    }

    @GetMapping
    public List<PlacementManagement> getAllPlacements() {
        return service.getAllPlacements();
    }

    @GetMapping("/{id}")
    public PlacementManagement getPlacement(@PathVariable Long id) {
        return service.getPlacementById(id);
    }

    @DeleteMapping("/{id}")
    public String deletePlacement(@PathVariable Long id) {
        service.deletePlacement(id);
        return "Placement deleted successfully";
    }
    
    @PutMapping("/{id}")
    public PlacementManagement updatePlacement(
            @PathVariable Long id,
            @RequestBody PlacementManagement placement) {
        return service.updatePlacement(id, placement);}
    
}

