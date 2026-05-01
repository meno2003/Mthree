package Practice.ObjectsAndClasses.ClassModeling;

public class HouseGPS {
    private String address;
    private double lattitude;
    private double longitude;
    private boolean isResidential;

    public HouseGPS(String address, double lattitude, double longitude, boolean isResidential){
        this.address = address;
        this.lattitude = lattitude;
        this.longitude = longitude;
        this.isResidential= isResidential;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public double getLattitude(){
        return lattitude;
    }

    public void setLattitude(double lattitude){
        this.lattitude = lattitude;
    }

    public double getLongitude(){
        return longitude;
    }

    public void setLongitude(){
        this.longitude = longitude;
    }

    public boolean isResidential(){
        return isResidential;
    }

    public void setResidential(){
        this.isResidential=isResidential;
    }

    public void calculateDistance() {}
    public void displayOnMap(){}

}
