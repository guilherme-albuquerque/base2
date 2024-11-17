package tests;

import core.BaseTest;
import core.Properties;
import org.junit.Test;
import pages.LoginPage;
import pages.TaskPage;
import static org.junit.Assert.assertTrue;

public class CreateTask extends BaseTest {

    @Test
    public void testCreateTask() {
        LoginPage loginPage = new LoginPage(driver);
        TaskPage taskPage = new TaskPage(driver);

        //Login
        loginPage.acessarPaginaLogin();
        loginPage.preencherUsuario(Properties.NOME_USUARIO);
        loginPage.clicarEntrar();
        loginPage.preencherSenha(Properties.SENHA);
        loginPage.clicarEntrar();

        //Criar Tarefa
        taskPage.criarTarefa();
        taskPage.selecaoCategoria();
        taskPage.selecaoFrequencia();
        String resumoEsperado = taskPage.preencherResumo();
        taskPage.preencherDescricao();
        taskPage.clicarCriarTarefa();


        //Validação
        String resumoAtual = taskPage.obterResumo(resumoEsperado);
        assertTrue(resumoAtual.contains(resumoEsperado));
    }
}