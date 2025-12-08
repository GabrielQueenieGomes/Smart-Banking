package com.cucumber.bdd.login;

public interface Login {
	void openChrome();
    void goToAppLink();

    void enterValidUsername();
    void enterValidPassword();

    void enterInvalidUsername();
    void enterInvalidPassword();

    void clickLoginButton();

    void loginShouldPass();
    void user_views_bank_account_information();
    void loginShouldFail();
}
