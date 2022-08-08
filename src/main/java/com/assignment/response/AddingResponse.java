package com.assignment.response;

public class AddingResponse {

	private int result;

	public AddingResponse(int num1, int num2) {

		this.result = num1+num2;
		
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}



}
