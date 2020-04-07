package com.employee.casestudy.response;

public class ResponseModel implements Response {
    private String message;
    private Object object;

    public ResponseModel() {
    }

    public ResponseModel(String message, Object object) {
        this.message = message;
        this.object = object;
    }

    public String getMessage() {
        return message;
    }

    public ResponseModel setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getObject() {
        return object;
    }

    public ResponseModel setObject(Object object) {
        this.object = object;
        return this;
    }
}
