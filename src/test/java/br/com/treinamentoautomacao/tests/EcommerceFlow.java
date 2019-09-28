package br.com.treinamentoautomacao.tests;

import br.com.treinamentoautomacao.pageObjects.BasePage;
import br.com.treinamentoautomacao.pageObjects.CategoryPage;
import br.com.treinamentoautomacao.pageObjects.HomePage;
import static org.junit.Assert.*;

import br.com.treinamentoautomacao.pageObjects.ProductDetailPage;
import org.junit.Test;

public class EcommerceFlow extends BaseTest{

    @Test
    public void testAcessarCategoriaTShirts() {
        HomePage homePage = new HomePage();
        CategoryPage categoryPage = new CategoryPage();
        ProductDetailPage productDetailPage = new ProductDetailPage();

        homePage.clickTitleCategoryMenu();

        assertEquals(categoryPage.textCatName(), "T-SHIRTS");

        String productName = categoryPage.textProdName();
        categoryPage.clickFirstProduct();

        assertEquals(productName, productDetailPage.textProdName());

    }
}
