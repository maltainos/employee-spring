package com.mobile.app.ws.ui.response;

public enum RequestOperationName {
	
	DELETE("Delete Recorde");
	
	private String operationName;
	
	RequestOperationName(String operationName){
		this.operationName = operationName;
	}
	
	public String getOperationName() {
		return operationName;
	}
}
