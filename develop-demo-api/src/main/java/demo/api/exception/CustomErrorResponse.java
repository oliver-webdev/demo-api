package demo.api.exception;

public class CustomErrorResponse {

	private int code;
	private String 메세지;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String get메세지() {
		return 메세지;
	}
	public void set메세지(String 메세지) {
		this.메세지 = 메세지;
	}

	@Override
	public String toString() {
		return "CustomErrorResponse [code=" + code + ", 메세지=" + 메세지 + "]";
	}
}
