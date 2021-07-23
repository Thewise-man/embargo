package main.models;

public class CountryDirection implements Direction {

    private String startingCountry;
    private String destinationCountry;

    public CountryDirection(String startingCountry, String destinationCountry) {
        this.startingCountry = startingCountry;
        this.destinationCountry = destinationCountry;
    }

    public String getStartingCountry() {
        return startingCountry;
    }

    public void setStartingCountry(String startingCountry) {
        this.startingCountry = startingCountry;
    }

    public String getDestinationCountry() {
        return destinationCountry;
    }

    public void setDestinationCountry(String destinationCountry) {
        this.destinationCountry = destinationCountry;
    }

    @Override
    public void calcDirectionKm() {

    }

    @Override
    public void calcBearing() {

    }

    @Override
    public String toString() {
        return "CountryDirection{" +
                "startingCountry='" + startingCountry + '\'' +
                ", destinationCountry='" + destinationCountry + '\'' +
                '}';
    }
}
