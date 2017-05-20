package com.learn.config;

import java.io.IOException;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.env.YamlPropertySourceLoader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.ClassPathResource;

/**
 *
 *
 * @author plashkar
 * @version 1.0
 * @date Jun 16, 2015
 */

@EnableConfigurationProperties({ AppConfigParams.class})
public class AppConfig {

	/**
	 * Initializes and reads configuration properties from application.yaml file
	 * and translates each properties into an object (e.g: ApplicationConfigParams)
	 * 
	 * @return
	 * @throws IOException
	 */
	@Bean
	public PropertySource<?> yamlPropertySourceLoader() throws IOException {
		YamlPropertySourceLoader loader = new YamlPropertySourceLoader();
		PropertySource<?> applicationYamlPropertySource = loader.load(
				"application.yml", new ClassPathResource("application.yml"),
				"default");
		return applicationYamlPropertySource;
	}
}
