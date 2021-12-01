package br.com.blockBit.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class CertificadoMap {
    @FindBy(css = "#certificate-name")
    public WebElement inpNome;
    @FindBy(css = "#certificate-device")
    public WebElement slcSistemaOperacional;
    @FindBy(xpath = "//*[@id='popup-new-certificate']//div[3]/button")

    public WebElement btnSalvar;
    @FindBy(xpath = "//*[@id='certificates']/li/div/span/..")
    public List<WebElement> textCertificados;
    @FindBy(css = "#pass-local-user")
    public WebElement inpSenha;
    @FindBy(css = "#confirm-local-user")
    public WebElement inpConfirma;
    @FindBy(xpath = "//*[@id='download-cu-local']/div[2]/button")
    public WebElement btnDownload;

}
