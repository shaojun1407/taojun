package com.ddb.javacore.exception;

public class ByZeroException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//都是工具自己生成的！
	public ByZeroException() {
		super();
	}

	public ByZeroException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ByZeroException(String message, Throwable cause) {
		super(message, cause);
	}

	public ByZeroException(String message) {
		super(message);
	}

	public ByZeroException(Throwable cause) {
		super(cause);
	}

}
