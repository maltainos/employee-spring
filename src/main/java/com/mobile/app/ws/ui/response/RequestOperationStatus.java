package com.mobile.app.ws.ui.response;

public enum RequestOperationStatus {
	
	SUCCESS("Successful request");
	
	private String operationStatus;
	
	RequestOperationStatus(String operationStatus){
		this.operationStatus = operationStatus;
	}
	
	public String getOperationStatus() {
		return operationStatus;
	}
}
