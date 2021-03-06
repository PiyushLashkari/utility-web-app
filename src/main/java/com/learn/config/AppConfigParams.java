package com.learn.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Initializes and loads application.yml file into a PropertySource (represents
 * a name & value property pairs)
 * 
 * @author plashkar
 * @version 1.0
 * @date February 16, 2015
 */
@ConfigurationProperties(prefix = "application")
public class AppConfigParams {

	// Defines the key for encryption algorithm
	public String decryptionKey;

	public String getDecryptionKey() {
		return decryptionKey;
	}

	public void setDecryptionKey(String decryptionKey) {
		this.decryptionKey = decryptionKey;
	}
}
