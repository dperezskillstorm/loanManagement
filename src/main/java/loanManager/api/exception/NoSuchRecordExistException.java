package loanManager.api.exception;

public class NoSuchRecordExistException extends RuntimeException {
	
	private String message;
	
	public NoSuchRecordExistException() {}
	
	public NoSuchRecordExistException(String msg) {
		super(msg);
		this.message = msg;
	}

	
	
	

}
