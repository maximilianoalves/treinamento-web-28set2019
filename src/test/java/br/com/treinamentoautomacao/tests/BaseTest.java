package br.com.treinamentoautomacao.tests;

import br.com.treinamentoautomacao.utils.Browser;
import br.com.treinamentoautomacao.utils.Utils;
import org.junit.After;
import org.junit.Before;

public class BaseTest {

    @Before
    public void setup() {
        Browser.loadPage(Utils.baseUrl());
    }

    @After
    public void tearDown(){
        Browser.close();
    }


}
