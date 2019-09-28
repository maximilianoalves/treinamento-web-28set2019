package br.com.treinamentoautomacao.pageObjects;

import br.com.treinamentoautomacao.utils.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoryPage extends BasePage {

    @FindBy(className = "cat-name")
    public WebElement catName;

    @FindBy(css = "div.right-block > h5 > a.product-name")
    public WebElement prodName;

    @FindBy(className = "first-in-line")
    public WebElement firstProduct;

    public CategoryPage() {
        PageFactory.initElements(
                Browser
                        .getCurrentWebDriver(),
                this
        );
    }

    public String textCatName() {
        return catName.getText().trim();
    }

    public String textProdName() {
        return prodName.getText().trim();
    }

    public void clickFirstProduct() {
        firstProduct.click();
    }
}
