package newsportlet.calc;

import java.io.Serializable;

public class SessionBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private int number = 0;

	public SessionBean() {
	}

	public void countUp() {
		this.number++;
	}

	public void countDown() {
		this.number--;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}
