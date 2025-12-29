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
    
    public PlacementManagement updatePlacement(Long id, PlacementManagement newData) {

        PlacementManagement existing = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Placement not found"));

        if (newData.getCompanyName() != null)
            existing.setCompanyName(newData.getCompanyName());

        if (newData.getJobRole() != null)
            existing.setJobRole(newData.getJobRole());

        if (newData.getLocation() != null)
            existing.setLocation(newData.getLocation());

        if (newData.getSalaryPackage() != 0)
            existing.setSalaryPackage(newData.getSalaryPackage());

        if (newData.getPlacementDate() != null)
            existing.setPlacementDate(newData.getPlacementDate());

        if (newData.getEligibleQualification() != null)
            existing.setEligibleQualification(newData.getEligibleQualification());

        if (newData.getEligiblePassoutYear() != null)
            existing.setEligiblePassoutYear(newData.getEligiblePassoutYear());

        return repository.save(existing);
    }
}

