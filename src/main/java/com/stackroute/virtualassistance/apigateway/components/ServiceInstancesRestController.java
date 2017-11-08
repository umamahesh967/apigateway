package com.stackroute.virtualassistance.apigateway.components;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;


@RestController
@RequestMapping(value="/v1/api")
@Api(value="Virtual Assistance API Gateway", description="Provides routes to micro-services")
class ServiceInstanceRestController {

    @Autowired
    private DiscoveryClient discoveryClient;

    
    @RequestMapping("/service-instances/{applicationName}")
    public List<ServiceInstance> serviceInstancesBypplicationName(
            @PathVariable String applicationName) {
    	try {
        return this.discoveryClient.getInstances(applicationName);
    	}
    	catch(Exception e) {
    		return null;
    	}
    	
    }
}
