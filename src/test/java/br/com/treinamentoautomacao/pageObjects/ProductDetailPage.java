package br.com.treinamentoautomacao.pageObjects;

import br.com.treinamentoautomacao.utils.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailPage extends BasePage {

    @FindBy(css = "div > h1")
    public WebElement prodName;

    public ProductDetailPage() {
        PageFactory.initElements(Browser.getCurrentWebDriver(), this);
    }

    public String textProdName() {
        return prodName.getText().trim();
    }


}
