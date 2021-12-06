package dev.swannherrera;

public class City {
    private final CityName cityName;
    private final int infectionLevel;

    private City(CityName cityName, int infectionLevel) {
        this.cityName = cityName;
        this.infectionLevel = infectionLevel;
    }

    public static City of(CityName cityName) {
        return new City(cityName, Config.BASE_INFECTION_LEVEL);
    }

    public City infect() {
        return new City(cityName, infectionLevel + Config.BASE_INFECTION_STEP);
    }

    public int getInfectionLevel() {
        return infectionLevel;
    }

    public CityName getName() {
        return cityName;
    }
}
