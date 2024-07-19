package com.magento.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BusquedaComprobantePage extends BasePage{

    By buttonBuscar= By.xpath("//button/span[@ngbtooltip='Ver Documento']");
    //By buttonBuscar= By.xpath("(//button)[5]");
    By inputNumDoc = By.id("lblNroDoc");
    public BusquedaComprobantePage(WebDriver driver) {
        super(driver);
    }

    public void llenarFiltro(String numDoc){
        type(inputNumDoc,numDoc);
    }

    public void clickButtonBuscar(){

        WebElement btnBuscarDoc = driver.findElement(buttonBuscar);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", btnBuscarDoc);

        System.out.println("se hixo clic");
    }

}
