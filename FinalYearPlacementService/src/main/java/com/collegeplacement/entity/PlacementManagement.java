package com.collegeplacement.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "placement_management")
public class PlacementManagement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "job_role")
    private String jobRole;

    @Column(name = "location")
    private String location;

    @Column(name = "salary_package")
    private double salaryPackage;

    @Column(name = "placement_date")
    private String placementDate;
    
    
    @Column(name = "eligible_qualification")
    private String eligiblequalification;     //B.E, B.Tech, MCA
    
    @Column(name = "eligible_passoutyear")
    private Integer eligiblePassoutYear;      // 2025

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCompanyName() { return companyName; }
    public void setCompanyName(String companyName) { this.companyName = companyName; }

    public String getJobRole() { return jobRole; }
    public void setJobRole(String jobRole) { this.jobRole = jobRole; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public double getSalaryPackage() { return salaryPackage; }
    public void setSalaryPackage(double salaryPackage) { this.salaryPackage = salaryPackage; }

    public String getPlacementDate() { return placementDate; }
    public void setPlacementDate(String placementDate) { this.placementDate = placementDate; }
}
