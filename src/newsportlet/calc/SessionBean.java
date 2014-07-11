package newsportlet.calc;

import java.io.Serializable;

import newsportlet.commons.SharedBean;

public class SessionBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private int number = 0;
	private SharedBean sharedBean;

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

	public newsportlet.commons.SharedBean getSharedBean() {
		return sharedBean;
	}

	public void setSharedBean(newsportlet.commons.SharedBean sharedBean) {
		this.sharedBean = sharedBean;
	}

}
