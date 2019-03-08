package io.indream.util;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Utility {
	private static final ObjectMapper MAPPER = new ObjectMapper();

	
	
	public static <S, D> D convertObject(S source, Class<D> destinationClass) {
		return MAPPER.convertValue(source, destinationClass);
	}

}
