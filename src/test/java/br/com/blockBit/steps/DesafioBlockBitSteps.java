package br.com.blockBit.steps;

import br.com.blockBit.core.Driver;
import br.com.blockBit.enums.Browser;
import br.com.blockBit.pages.CertificadoPage;
import br.com.blockBit.pages.LoginPage;
import br.com.blockBit.pages.MenuPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.util.Map;

public class DesafioBlockBitSteps {

    MenuPage menuPage;
    LoginPage loginPage;
    CertificadoPage certificadoPage;
    String nomeCertificado = "";

    @Before
    public void inicializaDriver(){
        new Driver(Browser.CHROME);

    }

    @After
    public void finalizaDriver(){
        Driver.getDriver().quit();
    }

    @Dado("que esteja na pagina principal")
    public void queEstejaNaPaginaPrincipal() {
        Driver.getDriver().get("https://189.108.60.138:9803/apps/auth-login.php");
        menuPage = new MenuPage();
        loginPage = new LoginPage();
        certificadoPage = new CertificadoPage();

    }
    @Dado("que esteja logado no sistema com")
    public void queEstejaLogadoNoSistemaCom(Map<String, String> map) {
        loginPage.setEmail(map.get("email"))
                .setPassword(map.get("senha"))
                .clickEntrar();

    }
    @Dado("acesso o menu certicado")
    public void acessoOMenuCerticado() {
        menuPage.clickMostrarCertificado();
    }
    @Quando("clico no botao novo de certificado")
    public void clicoNoBotaoNovoDeCertificado() {
        menuPage.clickNovoCertificado();
    }
    @Quando("preencho os campos e salvo os dados")
    public void preenchoOsCamposESalvoOsDados(Map<String, String> map) {
        nomeCertificado = map.get("nome");
        certificadoPage.setNome(map.get("nome"))
                .selectSistemaOperacional(map.get("sistema"))
                .clickSalvar();
    }
    @Entao("exibe o certificado gerado")
    public void exibeOCertificadoGerado() throws Exception {

        if (!certificadoPage.getCertificados().contains(nomeCertificado)){
            throw new Exception("certificado nao encontrado!");
        }

    }

    @Dado("acesso o menu sessao")
    public void acessoOMenuSessao() {
        menuPage.clickMostrarSessao();
    }
    @Quando("removo a sessao do usuario")
    public void removoASessaoDoUsuario() {
        menuPage.clickExcluirSessao();
    }
    @Entao("exibe a mensagem {string}")
    public void exibeAMensagem(String msg) {
        Assert.assertEquals(msg, menuPage.getNenhumItem());
    }

    @Quando("encerro a sessao do usuario")
    public void encerroASessaoDoUsuario() {
        menuPage.clickLogout();

    }
    @Entao("retorna para pagina de login")
    public void retornaParaPaginaDeLogin() {
        Assert.assertEquals("Portal de Autenticação", loginPage.getTitulo());
    }

    @Quando("realizo download do certificado com usuario logado")
    public void realizoDownloadDoCertificadoComUsuarioLogado() {
        menuPage.clickLinkDownloadCertificado();
    }
    @Entao("o download foi realizado")
    public void oDownloadFoiRealizado() {

    }

    @Quando("realizo o download do certificado com usuario nao logado")
    public void realizoODownloadDoCertificadoComUsuarioNaoLogado() {
        loginPage.clickDownloadCertificado();
    }

    @Quando("clico no botao download de certificado")
    public void clicoNoBotaoDownloadDeCertificado() {
        menuPage.clickDownloadCertificado();
    }
    @Quando("informo a senha {string}")
    public void informoASenha(String senha) {
        certificadoPage.setSenha(senha)
                .setConfirma(senha);
    }
    @Quando("realizo o download o certificado com senha")
    public void realizoODownloadOCertificadoComSenha() {
        certificadoPage.clickDownload();
    }


}
