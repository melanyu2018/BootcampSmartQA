package com.magento.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


public class FacturaTest extends BaseTest {

    @Test
    public void facturaSimple(){

        loginPage.fillOutFormData("demo-pvlg", "demo123");
        homePage.irFactura();
        comprobanteFacPage.datosCliente();
        comprobanteFacPage.datosDocumento();
        comprobanteFacPage.agregarItemManual();
        //comprobanteFacPage.agregarItemLogistico();
        comprobanteFacPage.clickButtonEmitir();

        WebElement frame=  new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe")));

        //Assertion de la serie de documento
        WebElement serie=  new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'F100')]")));
        Assert.assertEquals(serie.getDomProperty("textContent"),"F100" );

        //Se guarda el numero de correlativo para busqueda de comprobante
        WebElement correlativo=  new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("correlativo")));
        String numDoc=  correlativo.getDomProperty("textContent");

        //En busqueda de documento

        driver.navigate().to("https://erpperucrt.gitoca.com/admin/documentos/busqueda");

        WebElement optionSerie=  new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//option[contains(text(),'B003')]")));

        busquedaComprobantePage.llenarFiltro(numDoc);
        busquedaComprobantePage.clickButtonBuscar();





    }
}

