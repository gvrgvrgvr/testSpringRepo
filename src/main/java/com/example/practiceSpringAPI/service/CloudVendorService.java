package com.example.practiceSpringAPI.service;

import com.example.practiceSpringAPI.Model.CloudVendor;

import java.util.List;


public interface CloudVendorService {
    public String createCloudVendorDetails(CloudVendor cloudVendor);
    public String updateCloudVendorDetails(CloudVendor Id);
    public String deleteCloudVendorAPI(String randomI);
    public List<CloudVendor> getAllCloudVendorDetails();
    public CloudVendor getCloudVendorDetails(String vendorId);
}
