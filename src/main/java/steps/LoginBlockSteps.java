package steps;

import net.thucydides.core.annotations.Step;

public class LoginBlockSteps extends DefaultStepsData {

    @Step
    public void loginToSite(String login, String password){
        loginBlock.enterLogin(login);
        loginBlock.enterPassword(password);
        loginBlock.submitLogin();
    }
}
