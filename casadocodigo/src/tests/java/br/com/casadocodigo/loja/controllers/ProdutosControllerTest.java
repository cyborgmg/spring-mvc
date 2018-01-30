package br.com.casadocodigo.loja.controllers;

import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import br.com.casadocodigo.loja.conf.JPAConfiguration;
import br.com.casadocodigo.loja.confs.DataSourceConfigurationTest;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {JPAConfiguration.class, WebAppConfiguration.class, DataSourceConfigurationTest.class})
@ActiveProfiles("test")
public class ProdutosControllerTest {

}
