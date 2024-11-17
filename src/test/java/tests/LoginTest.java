package tests;

import core.BaseTest;
import core.Properties;
import org.junit.Assert;
import org.junit.Test;
import pages.LoginPage;
import pages.MenuPage;


public class LoginTest extends BaseTest {

    @Test
    public void testLoginInvalido() {
        LoginPage loginPage = new LoginPage(driver);
        MenuPage menuPage = new MenuPage(driver);

        loginPage.acessarPaginaLogin();
        loginPage.preencherUsuario("usuario_incorreto");
        loginPage.clicarEntrar();
        loginPage.preencherSenha("senha_incorreta");
        loginPage.clicarEntrar();

        String mensagemEsperada = "Sua conta pode estar desativada ou bloqueada ou o nome de usuário e a senha que você digitou não estão corretos.";
        Assert.assertTrue("A mensagem de erro não está visível!", menuPage.isMensagemErroVisivel());
        Assert.assertEquals("A mensagem de erro exibida não está correta!", mensagemEsperada, menuPage.getMensagemErro());
    }

    @Test
    public void testLoginValido() {
        LoginPage loginPage = new LoginPage(driver);
        MenuPage menuPage = new MenuPage(driver);

        loginPage.acessarPaginaLogin();
        loginPage.preencherUsuario(Properties.NOME_USUARIO);
        loginPage.clicarEntrar();
        loginPage.preencherSenha(Properties.SENHA);
        loginPage.clicarEntrar();

        Assert.assertTrue(loginPage.loginComSucesso());
    }

}