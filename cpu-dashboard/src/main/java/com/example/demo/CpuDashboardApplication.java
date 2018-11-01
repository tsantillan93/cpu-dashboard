package com.example.demo;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.configuration.AppConfig;
import io.strati.configuration.annotation.ManagedConfiguration;


@SpringBootApplication
public class CpuDashboardApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(CpuDashboardApplication.class, args);
	}
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(CpuDashboardApplication.class);
    }
}

@RestController
@RequestMapping("/ccm")
class CCMController {

    @ManagedConfiguration
    private AppConfig config;

    @GetMapping("/neil")
    public String getMyString() {
        return "Neil [" + config.getNeil() + "]";
    }

    @GetMapping("/test")
    public String getMyInteger() {
        return "Test Prop [" + config.getTest() + "]";
    }

    @GetMapping("/inherited")
    public String getMyArray() {
        return "Inherited Prop [" + config.getInherited() + "]";
    }
}