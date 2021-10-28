package com.mobile.app.ws.shared;

import java.security.SecureRandom;
import java.util.Random;

public class GenerateID {
	
	private final Random RANDOM = new SecureRandom();
	private final String PREFIX_ALPHABET = "1234567890";
	private final String SUFIX_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVXWYZ";
	private final String ALPHABET = "1234567890ABCDEFGHIJKLMNOPQRSTUVXWYZabcdefghijklmnopqrstuvxwyz";

	public String generateEmployerID(int length) {
		return generateRandomStringID(length);
	}
	
	public String generateEmployerCODE(int length) {
		return generateRandomString(length);
	}
	
	private String generateRandomString(int length) {
		return generateRandomStringPrefix(length);
	}
	
	private String generateRandomStringID(int length) {
		
		StringBuilder returnValue = new StringBuilder();
		for(int i = 0; i < length; i++) 
			returnValue.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
		
		return new String(returnValue);
	}

	private String generateRandomStrinSufix(StringBuilder builder) {
		builder.append(SUFIX_ALPHABET.charAt(RANDOM.nextInt(SUFIX_ALPHABET.length())));
		return new String(builder);
	}
	
	private String generateRandomStringPrefix(int length) {
		
		StringBuilder prefix = new StringBuilder();
		for(int i = 0; i < length; i++) 
			prefix.append(PREFIX_ALPHABET.charAt(RANDOM.nextInt(PREFIX_ALPHABET.length())));

		return generateRandomStrinSufix(prefix);
	}
}












