package br.com.casadocodigo.loja.controllers;

import java.util.concurrent.Callable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.casadocodigo.loja.models.CarrinhoCompras;
import br.com.casadocodigo.loja.models.DadosPagamento;

@Controller
@RequestMapping("/pagamento")
//@Scope(value=WebApplicationContext.SCOPE_SESSION, proxyMode=ScopedProxyMode.TARGET_CLASS/*caessa @Componet mesmo q esteja sem @Scope definido*/)
@Scope(value=WebApplicationContext.SCOPE_REQUEST)
public class PagamentoController {
	
	@Autowired
    CarrinhoCompras carrinho;
	
	@Autowired
    RestTemplate restTemplate;
	/*
	@RequestMapping(value="/finalizar", method=RequestMethod.POST)
	public ModelAndView finalizar(RedirectAttributes model){
		
		String response="";
		
	    
	        try {
	            String uri = "http://book-payment.herokuapp.com/payment";
	            response = restTemplate.postForObject(uri, new DadosPagamento(carrinho.getTotal()), String.class);
	            model.addFlashAttribute("sucesso", response);
	            System.out.println(response);
	            return new ModelAndView("redirect:/produtos");
	        } catch (HttpClientErrorException e) {
	            e.printStackTrace();
	            model.addFlashAttribute("falha", "Valor maior que o permitido");
	            return new ModelAndView("redirect:/produtos");
	        }
	    
	}
	*/
	
	@RequestMapping(value="/finalizar", method=RequestMethod.POST)
	public Callable<ModelAndView> finalizar(RedirectAttributes model){
	    return () -> {
	        try {
	            //String uri = "http://book-payment.herokuapp.com/payment";
	            //String response = restTemplate.postForObject(uri, new DadosPagamento(carrinho.getTotal()), String.class);
	            
	            String response = "Compra finalizada com sucesso!";
	            
	            model.addFlashAttribute("sucesso", response);
	            System.out.println(response);
	            return new ModelAndView("redirect:/produtos");
	        } catch (HttpClientErrorException e) {
	            e.printStackTrace();
	            model.addFlashAttribute("falha", "Valor maior que o permitido");
	            return new ModelAndView("redirect:/produtos");
	        }
	    };
	}

}
