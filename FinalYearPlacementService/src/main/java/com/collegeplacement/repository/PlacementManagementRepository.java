package com.collegeplacement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.collegeplacement.entity.PlacementManagement;

@Repository
public interface PlacementManagementRepository extends JpaRepository<PlacementManagement, Long> {
}
