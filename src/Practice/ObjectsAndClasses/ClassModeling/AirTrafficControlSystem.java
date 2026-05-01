package Practice.ObjectsAndClasses.ClassModeling;

public class AirTrafficControlSystem {

    private String airplaneID;
    private String from;
    private String to;
    private double departureTime;
    private double LandingTime;


    public AirTrafficControlSystem(String airplaneID, String from, String to, double departureTime, double LandingTime){
        this.airplaneID = airplaneID;
        this.from = from;
        this.to  = to;
        this.departureTime = departureTime;
        this.LandingTime = LandingTime;
    }

    public String getAirplaneID(){
        return  airplaneID;
    }

    public void setAirplaneID(String airplaneID) {
        this.airplaneID = airplaneID;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public double getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(double departureTime) {
        this.departureTime = departureTime;
    }

    public double getLandingTime() {
        return LandingTime;
    }

    public void setLandingTime(double landingTime) {
        LandingTime = landingTime;
    }

}


