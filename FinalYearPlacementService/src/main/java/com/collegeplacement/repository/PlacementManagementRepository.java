package com.collegeplacement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.collegeplacement.entity.PlacementManagement;

public interface PlacementManagementRepository
        extends JpaRepository<PlacementManagement, Long> {
}
