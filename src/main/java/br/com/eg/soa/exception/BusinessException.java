package br.com.eg.soa.exception;

public class BusinessException extends BaseException {


	public BusinessException(String message, Object[] arguments, Throwable cause) {
		super(message, arguments, cause);
	}

	private static final long serialVersionUID = 993554267175193098L;

}
