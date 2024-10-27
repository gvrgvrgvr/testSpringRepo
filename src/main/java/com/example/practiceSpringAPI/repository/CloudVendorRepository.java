package com.example.practiceSpringAPI.repository;

import com.example.practiceSpringAPI.Model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {
}
