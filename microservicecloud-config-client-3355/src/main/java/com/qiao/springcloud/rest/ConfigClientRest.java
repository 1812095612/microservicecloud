package com.qiao.springcloud.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientRest {

	@Value("${spring.application.name}")
	private String applicationName;

	@Value("${server.port}")
	private String serverPort;

	@Value("${eureka.client.service-url.defaultZone}")
	private String eurekaServers;

	@RequestMapping("/config")
	public String getConfig() {
		String config = "applicationName: " + applicationName + "\t serverPort: " + serverPort
											+ "\t eurekaServers:" + eurekaServers;
		System.out.println("***config***: " + config);
		return config;
	}
}
