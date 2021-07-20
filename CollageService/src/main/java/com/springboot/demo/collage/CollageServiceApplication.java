/**
 * 
 */
package com.springboot.demo.collage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author Arbind Negi 20-Jul-2021
 *
 */
@SpringBootApplication
@EnableCircuitBreaker
public class CollageServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(CollageServiceApplication.class, args);
	}
	
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
	return new RestTemplate();
    }
}
