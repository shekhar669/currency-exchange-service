package com.optum.impactpro.currencyexchangeservice.parallel.call;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Component
@Api(value = "CountryResource")
@RestController
public class CountryResource {
    
	@Autowired
    private CountryClient countryClient;

	@ApiOperation(httpMethod = "GET", value = "Get all European and French speaking countries", response = String.class, responseContainer = "List")

	@ApiResponses(value = {
			@ApiResponse(code = 404, message = "Countries not found"),
			@ApiResponse(code = 500, message = "The countries could not be fetched") })
    
    @GetMapping("frenchspeackingcn")
    public List<String> getAllEuropeanFrenchSpeakingCountries() {
        List<Country> countriesByLanguage = countryClient.getCountriesByLanguage("fr");
        List<Country> countriesByRegion = countryClient.getCountriesByRegion("europe");

        List<String> europeanFrenchSpeakingCountries = new ArrayList<>(countriesByLanguage.stream().map(Country::getName).collect(Collectors.toList()));
        europeanFrenchSpeakingCountries.retainAll(countriesByRegion.stream().map(Country::getName).collect(Collectors.toList()));

        return europeanFrenchSpeakingCountries;
    }
}
