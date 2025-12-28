package com.collegeplacement.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.collegeplacement.entity.PlacementManagement;
import com.collegeplacement.repository.PlacementManagementRepository;

@Service
public class PlacementManagementService {

    private final PlacementManagementRepository repository;

    public PlacementManagementService(PlacementManagementRepository repository) {
        this.repository = repository;
    }

    public PlacementManagement savePlacement(PlacementManagement placement) {
        return repository.save(placement);
    }

    public List<PlacementManagement> getAllPlacements() {
        return repository.findAll();
    }

    public PlacementManagement getPlacementById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deletePlacement(Long id) {
        repository.deleteById(id);
    }
}

