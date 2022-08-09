/*
 * package com.nos.parallel.call;
 * 
 * import static org.junit.jupiter.api.Assertions.assertEquals; import static
 * org.mockito.Mockito.mock; import static org.mockito.Mockito.when;
 * 
 * import java.util.ArrayList; import java.util.List; import
 * java.util.concurrent.CompletableFuture;
 * 
 * import org.junit.jupiter.api.BeforeEach; import org.junit.jupiter.api.Test;
 * import org.mockito.InjectMocks; import org.mockito.Mockito;
 * 
 * import com.nos.microservices.parallel.call.Country; import
 * com.nos.microservices.parallel.call.CountryClientAsyc; import
 * com.nos.microservices.parallel.call.CountryResourceAsync;
 * 
 * public class CountryResourceTest {
 * 
 * @InjectMocks private CountryResourceAsync countryResource;
 * 
 * private CountryClientAsyc countryClient;
 * 
 * @BeforeEach public void setup() { this.countryClient =
 * mock(CountryClientAsyc.class); this.countryResource = new
 * CountryResourceAsync(countryClient); }
 * 
 * @Test public void getAllEuropeanFrenchSpeakingCountries() throws Throwable {
 * //GIVEN Country country = new Country(); country.setName("France"); Country
 * country2 = new Country(); country2.setName("Belgium"); Country country3 = new
 * Country(); country3.setName("Germany"); List<Country> countriesByLanguage =
 * new ArrayList<>(); countriesByLanguage.add(country);
 * countriesByLanguage.add(country2); when(((CountryClientAsyc)
 * countryClient).getCountriesByLanguage(Mockito.anyString())).thenReturn(
 * CompletableFuture.completedFuture(countriesByLanguage)); List<Country>
 * countriesByRegion = new ArrayList<>(); countriesByRegion.add(country);
 * countriesByRegion.add(country3);
 * when(((CountryClientAsyc)countryClient).getCountriesByRegion(Mockito.
 * anyString())).thenReturn(CompletableFuture.completedFuture(countriesByRegion)
 * );
 * 
 * List<String> expectedResult = new ArrayList<>();
 * expectedResult.add("France");
 * 
 * //WHEN List<String> result =
 * countryResource.getAllEuropeanFrenchSpeakingCountries();
 * 
 * //THEN assertEquals(expectedResult, result); }
 * 
 * }
 */