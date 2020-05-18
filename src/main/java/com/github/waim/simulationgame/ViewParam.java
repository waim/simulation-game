package com.github.waim.simulationgame;
/**
 * ViewとControllerの値渡し用
 * @author waim
 *
 */
public class ViewParam {
	private String name;
	private String message;

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
