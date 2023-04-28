/*
 * package com.nos.parallel.call;
 * 
 * import static org.junit.jupiter.api.Assertions.assertEquals; import static
 * org.junit.jupiter.api.Assertions.assertNotNull;
 * 
 * import java.util.List; import java.util.concurrent.ExecutionException;
 * 
 * import org.junit.jupiter.api.BeforeEach; import org.junit.jupiter.api.Test;
 * import org.mockito.Mockito;
 * 
 * import com.nos.microservices.currencyexchangeservice.parallel.call.Country;
 * import com.nos.microservices.currencyexchangeservice.parallel.call.
 * CountryClientAsync;
 * 
 * public class CountryClientTest { private CountryClientAsync countryClient;
 * 
 * @BeforeEach public void setUp() { countryClient = Mockito.spy(new
 * CountryClientAsync()); }
 * 
 * @Test public void getCountryByLanguage() throws ExecutionException,
 * InterruptedException { List<Country> countriesByLanguage =
 * countryClient.getCountriesByLanguage("fr").get();
 * assertNotNull(countriesByLanguage); assertEquals("Belgium",
 * countriesByLanguage.get(0).getName()); }
 * 
 * @Test public void getCountryByRegion() throws ExecutionException,
 * InterruptedException { List<Country> countriesByRegion =
 * countryClient.getCountriesByRegion("europe").get();
 * assertNotNull(countriesByRegion); assertEquals("Åland Islands",
 * countriesByRegion.get(0).getName()); assertEquals("Albania",
 * countriesByRegion.get(1).getName()); }
 * 
 * }
 */