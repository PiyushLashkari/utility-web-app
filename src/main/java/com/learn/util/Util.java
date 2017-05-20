package com.learn.util;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Defines helper/util methods that performs common functionalities which
 * doesn't depend on the state of the object.
 * 
 */
public class Util {
	
	private static final Logger LOGGER = LoggerFactory
			.getLogger(Util.class);

	/**
	 * Determines whether the given string is a null or an empty string
	 * 
	 * @param value
	 * @return
	 */
	public static Boolean isNullOrEmpty(String value) {
		return (value == null || value.trim().length() == 0);
	}
	
	/**
	 * Encrypts the password using the Jasypt library 
	 * @param decrypted password, key
	 *            
	 * @return encrypted password
	 */
	public static String encrypt(String password, String key) {
		StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
		String encryptedPassword = null;
		encryptor.setPassword(key);
		try {
			encryptedPassword = encryptor.encrypt(password);
		} catch (Exception e) {
			LOGGER.error("Error occurred while decrypting password", e);
		}
		return encryptedPassword;
	}
	
	/**
	 * Decrypts the password using the Jasypt library 
	 * @param encrypted password, key
	 *            
	 * @return decrypted password
	 */
	public static String decrypt(String password, String key) {
		StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
		String decryptedPassword = null;
		encryptor.setPassword(key);
		try {
			decryptedPassword = encryptor.decrypt(password);
		} catch (Exception e) {
			decryptedPassword = "Incorrect Key";
			LOGGER.error("Error occurred while decrypting password", e);
		}
		return decryptedPassword;
	}
}
