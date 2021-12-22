package exceptionsexample;

public class CustomExceptionExp {

	public static void main(String[] args) throws CustomException {
		// TODO Auto-generated method stub

		try {
			int a=10/0;
		}
		catch(Exception e)
		{
			throw new CustomException("custom exception", "exception code");
		}
	}

}

class CustomException extends Exception
{
	private String error_code = "UNKNOW_ERROR";

	public CustomException(String msg, String errorCode) {
		super(msg);
		this.error_code = errorCode;

	}

	public String getErrorCode() {
		return error_code;
	}
}
