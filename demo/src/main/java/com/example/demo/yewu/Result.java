package com.example.demo.yewu;


public class Result {
    public static final int STATUS_OK = 200;
    public static final int STATUS_ERROR = 300;
    public static final int STATUS_TIMEOUT = 301;
    public static final int STATUS_INPUT_IMG_CODE = 302;
    protected int statusCode;
    protected String message;

    public int getStatusCode() {
        return this.statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Result(int statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }

    public Result() {
    }
}
