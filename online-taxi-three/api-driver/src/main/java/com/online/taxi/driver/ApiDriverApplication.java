package com.online.taxi.driver;

import com.online.taxi.driver.annotation.ExcudeRibbonConfig;
import com.online.taxi.driver.ribbonconfig.RibbonConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@EnableCircuitBreaker
//@EnableHystrix
@ComponentScan(excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,value=ExcudeRibbonConfig.class)
})
// 下面是让所有client都实现随机策略
//@RibbonClients(defaultConfiguration = RibbonConfiguration.class)
@RibbonClient(name = "service-sms",configuration = RibbonConfiguration.class)

public class ApiDriverApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiDriverApplication.class, args);
    }


    @Bean
    @LoadBalanced
    public RestTemplate restTemplate1() {
        return new RestTemplate();
    }

    /**
     * 手写简单ribbon
     * @return
     */
//	@Bean
//	public RestTemplate restTemplate() {
//		return new RestTemplate();
//	}

}
