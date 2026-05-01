package Practice.ObjectsAndClasses.ClassModeling;

public class FlightSim {
    private double speed;
    private double altitude;
    private double fuel;


    public FlightSim(double speedInput,double altitude,double fuel){
        this.speed = speedInput;
        this.altitude=altitude;
        this.fuel = fuel;
    }
    public void setspeedInput(double speed){
        this.speed = speed;
    }
    public double getSpeed(){
        return speed;
    }

    public void setAltitude(double altitude){
        this.altitude = altitude;
    }

    public double getAltitude(){
        return altitude;
    }
    public void setFuel(double fuel){
        this.fuel = fuel;

    }

    public double getFuel(){
        return fuel;
    }
}

