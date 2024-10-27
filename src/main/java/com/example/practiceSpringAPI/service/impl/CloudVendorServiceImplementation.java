package com.example.practiceSpringAPI.service.impl;

import com.example.practiceSpringAPI.repository.CloudVendorRepository;
import com.example.practiceSpringAPI.service.CloudVendorService;
import com.example.practiceSpringAPI.Model.CloudVendor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServiceImplementation implements CloudVendorService {

    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImplementation(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String createCloudVendorDetails(CloudVendor cloudVendor) {
        // Creates the Cloud Vendor details

        cloudVendorRepository.save(cloudVendor);
        return "Cloud Vendor Details Created";
    }

    @Override
    public String updateCloudVendorDetails(CloudVendor Id) {
        // Updates the Cloud Vendor details based on the vendorId

        cloudVendorRepository.save(Id);
        return "Cloud Vendor Details Updated";
    }

    @Override
    public String deleteCloudVendorAPI(String randomI) {
        // Deletes the Cloud Vendor details based on the vendorId

        cloudVendorRepository.deleteById(randomI);

        return "Cloud Vendor API Deleted";
    }

    @Override
    public List<CloudVendor> getAllCloudVendorDetails() {
        // Returns the list of all Cloud Vendors

        return cloudVendorRepository.findAll();
    }


    @Override
    public CloudVendor getCloudVendorDetails(String vendorId) {
        // Returns the Cloud Vendor details based on the vendorId

        return cloudVendorRepository.findById(vendorId).get();
    }
}
