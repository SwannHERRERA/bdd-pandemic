package dev.swannherrera;

public class City {
    private final CityName cityName;
    private int infectionLevel;
    public void infect() {
        infectionLevel += Config.BASE_INFECTION_STEP;
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
    private City(CityName cityName, int infectionLevel) {
        this.cityName = cityName;
        this.infectionLevel = infectionLevel;
    }

    public static City of(CityName cityName) {
        return new City(cityName, Config.BASE_INFECTION_LEVEL);
    }
}
