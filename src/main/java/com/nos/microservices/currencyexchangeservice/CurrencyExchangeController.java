package com.nos.microservices.currencyexchangeservice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {
	@Autowired
	private Environment env;
	@Autowired
	private ExchangeValueRepository repo;
	private Logger logger =LoggerFactory.getLogger(CurrencyExchangeController.class);
	
	@GetMapping("currency-exchange/from/{from}/to/{to}")

	public ExchangeValue retrieveExchangevalue(HttpServletRequest req,@PathVariable String from , @PathVariable String to, HttpServletResponse response){
		
		ExchangeValue ex=repo.findByFromAndTo(from, to);
		ex.setPort(Integer.valueOf(env.getProperty("local.server.port"))+3000);
		
		logger.info("{}", ex);
		
		return ex;
		
	}
	
}
