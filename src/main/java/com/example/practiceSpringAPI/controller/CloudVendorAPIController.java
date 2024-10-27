package com.example.practiceSpringAPI.controller;


import com.example.practiceSpringAPI.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;
import com.example.practiceSpringAPI.Model.CloudVendor;

@RestController
@RequestMapping("/cloudVendor")
public class CloudVendorAPIController {

    // Points to be noted here
    // The CloudVendorService is autowired to the CloudVendorAPIController
    // The autowired class is having a constructor which takes the CloudVendorService as an argument
    //      - The autowired Service (Interface) may have more than one implementation class , for now we have only one implementation class
    // This controller - service - repository seems to be interconnected with the annotations and the constructors.
    //       - For now we have only one service wiring/constructor to one controller but
    //       - in real time we may have multiple controllers with multiple services connected to multiple repositories
    //       - The service is the one which is responsible for the business logic and the repository is responsible for the database operations
    // The controller is responsible for the API endpoints and the request and response handling.


    //Important things regarding the annotations across the three layers
    // The @Service annotation is used in the service layer
    // The @Repository annotation is used in the repository layer
    //    -- The @Repository annotation is a specialization of the @Component annotation with similar use and functionality.
    // The @RestController annotation is used in the controller layer along with the @RequestMapping annotation
    //           ---The @GetMapping, @PostMapping, @PutMapping, @DeleteMapping annotations are used in the controller layer to handle the HTTP requests
    //           --- We haven't used it but , the @Autowired annotation is used in the controller layer to autowire the service layer.
    // The @Entity annotation is used in the model layer


    public CloudVendorAPIController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    CloudVendorService cloudVendorService;
    @GetMapping("{vendorID}")
    public CloudVendor method1(@PathVariable("vendorID") String hi) {
        return cloudVendorService.getCloudVendorDetails(hi);
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        return cloudVendorService.createCloudVendorDetails(cloudVendor);
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        return cloudVendorService.updateCloudVendorDetails(cloudVendor);
    }

    @DeleteMapping("{vendorID}")
    public String deleteCloudVendorAPI(@PathVariable("vendorID") String hi){
        return cloudVendorService.deleteCloudVendorAPI(hi);
    }


}
