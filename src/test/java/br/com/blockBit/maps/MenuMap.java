package br.com.blockBit.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuMap {
    @FindBy(xpath = "//span[text() = 'Certificados']/../div/button[1]")
    public WebElement btnMostrarCertificado;
    @FindBy(xpath = "//div[2]/div[2]/button")
    public WebElement btnNovoCertificado;
    @FindBy(xpath = "//ul[@id = 'certificates']/li/div/i[1]")
    public WebElement btnDownloadCertificado;

    @FindBy(xpath = "//span[text() = 'Sessões']/../div/button[1]")
    public WebElement btnMostrarSessao;
    @FindBy(xpath = "//ul[@id='firewall-sessions']/li/div[4]")
    public WebElement btnExcluirSessao;
        //enviar um enter
    @FindBy(css = "#firewall-sessions > li > center")
    public WebElement textNenhumItem;
    @FindBy(css = "a[title='Logout']")
    public WebElement linkLogout;
    //enviar um enter
    @FindBy(css = "a[title='Download da autoridade certificadora']")
    public WebElement linkDownloadCertificado;
}
