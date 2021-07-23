package main.models;

public class StateDirection implements Direction {
    private String country;
    private String startingState;
    private String destinationState;

    public StateDirection(String country, String startingState, String destinationState) {
        this.country = country;
        this.startingState = startingState;
        this.destinationState = destinationState;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStartingState() {
        return startingState;
    }

    public void setStartingState(String startingState) {
        this.startingState = startingState;
    }

    public String getDestinationState() {
        return destinationState;
    }

    public void setDestinationState(String destinationState) {
        this.destinationState = destinationState;
    }

    @Override
    public void calcDirectionKm() {

    }

    @Override
    public void calcBearing() {

    }
}
