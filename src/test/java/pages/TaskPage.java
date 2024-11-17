package pages;

import core.BasePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Random;

import java.time.Duration;

public class TaskPage extends BasePage {
    private By botaoCriarTarefa = By.xpath("//*[@id=\"sidebar\"]/ul/li[3]/a");

    public TaskPage(WebDriver driver) {
        super(driver);
    }

    public void criarTarefa() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(botaoCriarTarefa));
        click(botaoCriarTarefa);
    }

    public void selecaoCategoria() {
        click(By.xpath("//*[@id=\"category_id\"]"));
        if (Math.random() < 0.5) {
            click(By.xpath("//option[1]"));
        } else {
            click(By.xpath("//option[2]"));
        }
    }

    public void selecaoFrequencia() {
        click(By.xpath("//*[@id=\"reproducibility\"]"));
        int optionIndex = (int) (Math.random() * 6) + 1;
        click(By.xpath("//option[" + optionIndex + "]"));
    }

    public String preencherResumo() {
        String[] randomNames = {"Task1", "Task2", "Task3", "Task4", "Task5"};
        Random random = new Random();
        String randomName = randomNames[random.nextInt(randomNames.length)];
        type(By.xpath("//*[@id=\"summary\"]"), randomName);
        return randomName;
    }

    public void preencherDescricao() {
        String[] randomDescriptions = {
                "Descrição da tarefa 1",
                "Descrição da tarefa 2",
                "Descrição da tarefa 3",
                "Descrição da tarefa 4",
                "Descrição da tarefa 5"
        };
        Random random = new Random();
        String randomDescription = randomDescriptions[random.nextInt(randomDescriptions.length)];
        type(By.xpath("//*[@id=\"description\"]"), randomDescription);
    }

    public void clicarCriarTarefa() {
        click(By.xpath("//input[@type='submit' and @value='Criar Nova Tarefa']"));
    }

    public String obterResumo(String resumoEsperado) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"main-container\"]/div[2]/div[2]/div/div[1]/div/div[2]/div[2]/div/table/tbody/tr[10]/td[contains(text(),'" + resumoEsperado + "')]")));
        return element.getText();
    }

}