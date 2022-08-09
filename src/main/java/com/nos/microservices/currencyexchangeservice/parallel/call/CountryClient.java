package com.nos.microservices.currencyexchangeservice.parallel.call;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CountryClient {
	RestTemplate restTemplate = new RestTemplate();

    public List<Country> getCountriesByLanguage(String language) {
        String url = "https://restcountries.eu/rest/v2/lang/" + language + "?fields=name";
        Country[] response = restTemplate.getForObject(url, Country[].class);

        return Arrays.asList(response);
    }

    public List<Country> getCountriesByRegion(String region) {
        String url = "https://restcountries.eu/rest/v2/region/" + region + "?fields=name";
        Country[] response = restTemplate.getForObject(url, Country[].class);

        return Arrays.asList(response);
    }

}
