package br.com.blockBit.pages;

import br.com.blockBit.core.Driver;
import br.com.blockBit.maps.CertificadoMap;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class CertificadoPage {
    CertificadoMap certificadoMap;
    public CertificadoPage(){
        certificadoMap = new CertificadoMap();
        PageFactory.initElements(Driver.getDriver(), certificadoMap);
    }

    public CertificadoPage setNome(String nome){
        Driver.visibilityOf(certificadoMap.inpNome);
        certificadoMap.inpNome.sendKeys(nome);
        return this;
    }
    public CertificadoPage selectSistemaOperacional(String sistemaOperacional){
        Select select = new Select(certificadoMap.slcSistemaOperacional);
        select.selectByVisibleText(sistemaOperacional);
        return this;
    }
    public CertificadoPage clickSalvar(){
        certificadoMap.btnSalvar.click();
        return this;
    }

    public List<String> getCertificados(){
     //   Driver.getDriver().findElement(By.cssSelector("html")).sendKeys(Keys.ENTER);
        List<String> certificados = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            if (certificadoMap.textCertificados.size() > 1){
                System.out.println(certificadoMap.textCertificados.size());
                for (WebElement certificado:
                     certificadoMap.textCertificados) {
                    certificados.add(certificado.getText().trim());
                }
                break;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(certificados);
        return certificados;
    }
    public CertificadoPage setSenha(String senha){
        Driver.visibilityOf(certificadoMap.inpSenha);
        certificadoMap.inpSenha.sendKeys(senha);
        return this;
    }
    public CertificadoPage setConfirma(String confirma){
        certificadoMap.inpConfirma.sendKeys(confirma);
        return this;
    }
    public CertificadoPage clickDownload(){
        certificadoMap.btnDownload.click();
        return this;
    }
}