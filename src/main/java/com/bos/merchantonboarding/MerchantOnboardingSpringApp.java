package com.bos.merchantonboarding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;

@Import({ MerchantController.class })
@SpringBootApplication
public class MerchantOnboardingSpringApp extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(MerchantOnboardingSpringApp.class, args);
	}
}
