package br.com.blockBit.pages;

import br.com.blockBit.core.Driver;
import br.com.blockBit.maps.MenuMap;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

public class MenuPage {
    MenuMap menuMap;
    public MenuPage(){
        menuMap = new MenuMap();
        PageFactory.initElements(Driver.getDriver(), menuMap);
    }

    public MenuPage clickMostrarCertificado(){
        Driver.visibilityOf(menuMap.btnMostrarCertificado);
        menuMap.btnMostrarCertificado.click();
        return this;
    }
    public MenuPage clickNovoCertificado(){
        menuMap.btnNovoCertificado.click();
        return this;
    }
    public MenuPage clickDownloadCertificado(){
        Driver.visibilityOf(menuMap.btnDownloadCertificado);
        menuMap.btnDownloadCertificado.click();
        return this;
    }
    public MenuPage clickMostrarSessao(){
        Driver.visibilityOf(menuMap.btnMostrarSessao);
        menuMap.btnMostrarSessao.click();
        return this;
    }
    public MenuPage clickExcluirSessao(){
        Driver.visibilityOf(menuMap.btnExcluirSessao);
        menuMap.btnExcluirSessao.click();
        return this;
    }
    public String getNenhumItem(){
        Driver.acceptAlert();
        Driver.visibilityOf(menuMap.textNenhumItem);
        return menuMap.textNenhumItem.getText();
    }
    public MenuPage clickLogout(){
        Driver.visibilityOf(menuMap.linkLogout);
        menuMap.linkLogout.click();
        Driver.acceptAlert();
        return this;
    }
    public MenuPage clickLinkDownloadCertificado(){
        Driver.visibilityOf(menuMap.linkDownloadCertificado);
        menuMap.linkDownloadCertificado.click();
        return this;
    }
}
