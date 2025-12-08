package com.page.object.model;

public class PageObjectModel {
	private String appURL = "file:///C:/Users/Queenie/Documents/qa_online%20Banking%20monthly_yearly%20statement%20-bug%20fixed.html";
    private String userLoct = "//*[@id='username']";
    private String userValue = "Batch44";

    private String passLoct = "//*[@id='password']";
    private String passValue = "student123@";

    private String loginLoct = "//*[@value='Login']";
    private String logoutLoct = "//*[@id='logoutButton']";

    public String getAppURL() {
        return appURL;
    }

    public String getUserLoct() {
        return userLoct;
    }

    public String getUserValue() {
        return userValue;
    }

    public String getPassLoct() {
        return passLoct;
    }

    public String getPassValue() {
        return passValue;
    }

    public String getLoginLoct() {
        return loginLoct;
    }

    public String getLogoutLoct() {
        return logoutLoct;
    }
}
