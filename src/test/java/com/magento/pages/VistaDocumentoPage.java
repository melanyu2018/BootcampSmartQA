package com.magento.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VistaDocumentoPage extends BasePage{

    public VistaDocumentoPage(WebDriver driver) {
        super(driver);
    }
    By frameDocument= By.xpath("//iframe");
    public void esperaCargaPagina(){
        isDisplay(frameDocument);
    }

    public void esperaCargaTodaPagina(){
        WebElement element =  driver.findElement(frameDocument);
        isDisplayAll(element);
    }


}
