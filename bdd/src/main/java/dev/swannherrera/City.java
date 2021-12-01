package dev.swannherrera;

public class City {
    private final CityName cityName;
    private int infectionLevel;
    public void infect() {
        infectionLevel += 1;
    }
    public int getInfectionLevel() {
        return infectionLevel;
    }
    public CityName getName() {
        return cityName;
    }
    public City(CityName cityName) {
        this.cityName = cityName;
    }
}
