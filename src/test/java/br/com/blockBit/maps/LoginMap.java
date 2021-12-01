package br.com.blockBit.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginMap {
    @FindBy(css = "#login")
    public WebElement inpEmail;
    @FindBy(css = "#password")
    public WebElement inpPassword;
    @FindBy(css = ".login")
    public WebElement btnEntrar;
    @FindBy(css = "#certificate-download > a")
    public WebElement linkDownloadCertificado;
    @FindBy(xpath = "//*[@id='form']/div[1]/div[1]/center[1]/p")
    public WebElement textTitulo;

}
