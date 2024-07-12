package com.magento.pages;

import com.magento.utils.Variable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    WebDriver driver;

    /*
    Web Elements
     */
    By linkAccount= By.linkText("Create an Account");
    By linkSignIn= By.linkText("Sign In");

    /*
    Constructor
     */
    public HomePage(WebDriver driver) {
        super(driver);
        visit(Variable.BASE_URL);
    }

    /*
    Metodos
     */

    public void  goToRegisterLink(){
        click(linkAccount);
    }
    public void  goToSignInLink(){
        click(linkSignIn);
    }
    public String verifyTittle(){
        return  null;
    }

}
