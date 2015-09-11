package serviceTester.core.domain;

public class ErrorNode {

	private int responseCode;
	private String errorMsg;
	
	
	public ErrorNode(){
		this.responseCode = -1;
		this .errorMsg = "";
	}
	
	public int getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	
}
