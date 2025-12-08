package com.cucumber.bdd.login;

public class Login_Page implements Login {
	@Override
    public void openChrome() {
        System.out.println("Chrome opening logic reused here!");
    }

    @Override
    public void goToAppLink() {
        System.out.println("Go to app link reused!");
    }

    @Override
    public void enterValidUsername() {}

    @Override
    public void enterValidPassword() {}

    @Override
    public void enterInvalidUsername() {}

    @Override
    public void enterInvalidPassword() {}

    @Override
    public void clickLoginButton() {}

    @Override
    public void loginShouldPass() {}
    
    @Override
    public void user_views_bank_account_information() {}

    @Override
    public void loginShouldFail() {}
}
