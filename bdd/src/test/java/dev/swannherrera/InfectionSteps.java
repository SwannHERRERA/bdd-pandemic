package dev.swannherrera;

import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static dev.swannherrera.CityName.PARIS;
import java.util.Map;

import org.assertj.core.api.Assertions;
import org.assertj.core.util.Maps;

public class InfectionSteps {
    Map<CityName, City> map = Maps.newHashMap(PARIS, new City(PARIS));

    @ParameterType(".*")
    public CityName cityName(String cityName) {
        return CityName.valueOf(cityName.toUpperCase());
    }

    @ParameterType(".*")
    public City city(String cityName) {
        CityName city = CityName.valueOf(cityName.toUpperCase());
        return map.get(city);
    }

    @Given("{cityName} has not been infected")
    public void parisHasNotBeenInfected(CityName cityName) {
        var city = City.of(cityName);
        map.put(cityName, city);
    }

    @When("{city} is infected")
    public void cityIsInfected(City city) {
        city.infect();
    }

    @Then("{city}' infection level should be increse to {int}")
    public void cityInfectionLvelShouldBeIncreseTo(City city, int expectedInfectionLevel) {
        Assertions.assertThat(city.getInfectionLevel()).isEqualTo(expectedInfectionLevel);
    }

}