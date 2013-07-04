package br.com.eg.soa.exception;

public class BaseException extends RuntimeException {

	private static final long serialVersionUID = -9194462379812825862L;
	
	private Object[] arguments;
	
	public BaseException(String message, Object[] arguments, Throwable cause) {
		super(message, cause);
		this.arguments = arguments;
	}

	public BaseException(String message, Object[] arguments) {
		super(message);
		this.arguments = arguments;
	}
	
	public Object[] getArguments() {
		return arguments;
	}

}