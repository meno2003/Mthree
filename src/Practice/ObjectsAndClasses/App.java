package Practice.ObjectsAndClasses;

import Practice.ObjectsAndClasses.ClassModeling.AirTrafficControlSystem;
import Practice.ObjectsAndClasses.ClassModeling.FlightSim;
import Practice.ObjectsAndClasses.ClassModeling.HouseGPS;

public class App {
    public static void main (String[] args){
        Dog mydog = new Dog();
        mydog.setName("dawg");
        mydog.setWeight(30.0);

        Dog anotherDog = new Dog();
        anotherDog.setName("dawg 2");
        anotherDog.setWeight(28);

        Student s1 = new Student();
        s1.setName("jack");
        s1.setGrades(new double[]{});

        HouseGPS house1 = new HouseGPS("addr",123,123,true);



        AirTrafficControlSystem heathrowT1 = new AirTrafficControlSystem("WS12D","Ontario","London",12.00,6.00);
        AirTrafficControlSystem heathrowT4 = new AirTrafficControlSystem("JK21F","London","Ontario",6.00,12.00);

        FlightSim plane1 = new FlightSim(200.0,140.0,12.0);


        plane1.setFuel(15.0);
        System.out.println(plane1.getFuel());
    }


}
