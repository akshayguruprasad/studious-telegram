package io.indream.exceptions;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver;

public class ExceptionHandler extends ExceptionHandlerExceptionResolver {
	private static final Logger LOGGER = Logger.getLogger(ExceptionHandler.class);

	@org.springframework.web.bind.annotation.ExceptionHandler(value = Exception.class)
	public ResponseEntity<String> generalException(Exception e) {
		LOGGER.error(e.getMessage());
		return new ResponseEntity<String>("Error Page !!!",HttpStatus.NOT_FOUND);
	}

}
