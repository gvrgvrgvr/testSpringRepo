package com.example.practiceSpringAPI.controller;


import org.springframework.web.bind.annotation.*;
import com.example.practiceSpringAPI.Model.ModelClass;

@RestController
@RequestMapping("/cloudVendor")
public class CloudVendorAPIService {

    ModelClass modelClass;

    @GetMapping("{vendorID}")
    public ModelClass method1(String hi) {
//        return new ModelClass("Name1", 12345, 4.5);
        return modelClass;
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody ModelClass modelClass) {
        this.modelClass = modelClass;
        return "Cloud Vendor created successfully";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody ModelClass modelClass){
        this.modelClass = modelClass;
        return "Cloud vendor updated successfully";
    }

    @DeleteMapping("{vendorID}")
    public String deleteCloudVendorAPI(String hi){
        this.modelClass = null;
        return "unchanged main";
    }


}
