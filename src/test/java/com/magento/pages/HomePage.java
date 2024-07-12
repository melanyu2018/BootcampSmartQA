package com.magento.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
        //visit(Variables.BASE_URL);
    }

    By linkFacturaFac = By.linkText("Nueva factura");
    By linkBoletaFac = By.linkText("Nueva boleta");
    By linkTicketVFac = By.linkText("Nuevo ticket de venta");
    By linkCotizacionFac = By.linkText("Nueva cotización");
    By linkBusquedaDoc = By.linkText("Búsqueda de documentos");
    By linkMisCajas = By.linkText("Ir a mis cajas");
    By linkVerHist = By.linkText("Ver historial de caja");

    public void testHome() {
        WebElement buttonLog = driver.findElement(linkFacturaFac);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", buttonLog);
    }
    public void irFactura(){
        WebElement linkDirect = driver.findElement(linkFacturaFac);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", linkDirect);
    }
    public void irBoleta(){
        WebElement linkDirect = driver.findElement(linkBoletaFac);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", linkDirect);
    }
    public void irTicket(){
        WebElement linkDirect = driver.findElement(linkTicketVFac);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", linkDirect);
    }
    public void irCotizacion(){
        WebElement linkDirect = driver.findElement(linkCotizacionFac);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", linkDirect);
    }
    public void irBusqueda(){
        WebElement linkDirect = driver.findElement(linkBusquedaDoc);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", linkDirect);
    }
    public void irMisCajas(){
        WebElement linkDirect = driver.findElement(linkMisCajas);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", linkDirect);
    }

}