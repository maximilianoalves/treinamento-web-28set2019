package br.com.treinamentoautomacao.pageObjects;

import lombok.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@Data
public class HomePage extends BasePage {

    //public String name = faker.name().fullName();

    public String TITLETShirts = "T-SHIRTS";


    public WebElement titleCategoryMenu() {
        return driver
                .findElement(
                        By.linkText(
                                this.getTITLETShirts()
                        )
                );
    }

    public void clickTitleCategoryMenu(){
        titleCategoryMenu().click();
    }



}
