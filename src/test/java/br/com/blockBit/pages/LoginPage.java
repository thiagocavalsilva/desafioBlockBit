package br.com.blockBit.pages;

import br.com.blockBit.core.Driver;
import br.com.blockBit.maps.LoginMap;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    LoginMap loginMap;
    public LoginPage(){
        loginMap = new LoginMap();
        PageFactory.initElements(Driver.getDriver(), loginMap);
    }

    public LoginPage setEmail(String email){
        loginMap.inpEmail.sendKeys(email);
        return this;
    }
    public LoginPage setPassword(String password){
        loginMap.inpPassword.sendKeys(password);
        return this;
    }
    public LoginPage clickEntrar(){
        loginMap.btnEntrar.click();
        return this;
    }
    public LoginPage clickDownloadCertificado(){
        Driver.visibilityOf(loginMap.linkDownloadCertificado);
        loginMap.linkDownloadCertificado.click();
        return this;
    }
    public String getTitulo(){
        Driver.visibilityOf(loginMap.textTitulo);
        return loginMap.textTitulo.getText();
    }
}

