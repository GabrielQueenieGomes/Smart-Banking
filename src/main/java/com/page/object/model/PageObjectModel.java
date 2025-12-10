package com.page.object.model;

public class PageObjectModel {
	private String appURL = "file:///C:/Users/Queenie/Documents/qa_online%20Banking%20monthly_yearly%20statement%20-bug%20fixed.html";
    private String userLoct = "//*[@id='username']";
    private String userValue = "Batch44";
    private String wrongUser = "wrongUser";

    private String passLoct = "//*[@id='password']";
    private String passValue = "student123@";
    private String wrongPass = "wrongPass123";

    private String loginLoct = "//*[@value='Login']";
    private String logoutLoct = "//*[@id='logoutButton']";
    
    private String accountXpath = "//*[text()='Account']";
    private String tableRow = "//table/tbody/tr";
    private String tableColumn = "//table/tbody/tr[1]/td";
    private String tableCell = "//table/tbody/tr[1]/td[1]";

    public String getAppURL() {
        return appURL;
    }

    public String getUserLoct() {
        return userLoct;
    }

    public String getUserValue() {
        return userValue;
    }

    public String getWrongUser() {
    	return wrongUser;
    }
    
    public String getPassLoct() {
        return passLoct;
    }

    public String getPassValue() {
        return passValue;
    }

    public String getWrongPass() {
    	return wrongPass;
    }
    
    
    public String getLoginLoct() {
        return loginLoct;
    }

    public String getLogoutLoct() {
        return logoutLoct;
    }

	public String getAccountXpath() {
		return accountXpath;
	}

	public String getTableRow() {
		return tableRow;
	}

	public String getTableColumn() {
		return tableColumn;
	}

	public String getTableCell() {
		return tableCell;
	}

}
