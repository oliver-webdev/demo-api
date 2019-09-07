package demo.api.exception;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class BrCodeNotFoundExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(BrCodeNotFoundException.class)
	public ResponseEntity<CustomErrorResponse> handleNotFound(Exception e,  WebRequest request) throws IOException {
		CustomErrorResponse error = new CustomErrorResponse();
		error.setCode(HttpStatus.NOT_FOUND.value());
		error.set메세지(e.getMessage());
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
}
