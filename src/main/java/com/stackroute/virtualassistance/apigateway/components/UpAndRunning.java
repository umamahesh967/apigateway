package com.stackroute.virtualassistance.apigateway.components;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpAndRunning implements ErrorController{
	@RequestMapping("/")
	public String home() {
        return "Up and Running";
    }
	@RequestMapping("/error")
	public String err() {
        return "up and running";
    }
	@Override
	public String getErrorPath() {
		return "/error";
	}
}


