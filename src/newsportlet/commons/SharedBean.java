package newsportlet.commons;

import java.io.Serializable;

public class SharedBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private int number = 0;
	private String from = null, message = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getObjectId() {
		return this.toString();
	}

}
