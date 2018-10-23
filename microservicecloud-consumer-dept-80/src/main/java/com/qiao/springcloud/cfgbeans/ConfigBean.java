package com.qiao.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {

	@LoadBalanced //消费者端的负载均衡工具
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	/*@Bean
	public IRule myRule() {
		//return new RandomRule(); //选择随机算法替换默认的轮询
		return new RetryRule();
	}*/

}