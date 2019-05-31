import java.util.HashMap;

public class Main {

    public static void main(String[] args){


        System.out.println(Bike.counter);
        Bike bike1 = new Bike("Yellow", "CanBeRented" );
        Bike bike2 = new Bike("Green", "CanNotBeRented");
        Bike bike3 = new Bike("Red", "InService");
        Bike bike4 = new Bike("Black", "Discarded");
        Bike bike5 = new Bike("Blue", "InService");
        Bike bike6 = new Bike("Black", "Discarded");
        Bike bike7 = new Bike("White", "CanNotBeRented");
        Bike bike8 = new Bike("Pink", "Discarded");
        Bike bike9 = new Bike("Purple", "CanBeRented");


        System.out.println(bike7.getBikeID());


        HashMap<Integer,Bike> Bikes = new HashMap<Integer,Bike>();
        Bikes.put(bike1.getBikeID(), bike1);
        Bikes.put(bike2.getBikeID(), bike2);
        Bikes.put(bike3.getBikeID(), bike3);
        Bikes.put(bike4.getBikeID(), bike4);
        Bikes.put(bike5.getBikeID(), bike5);
        Bikes.put(bike6.getBikeID(), bike6);
        Bikes.put(bike7.getBikeID(), bike7);
        Bikes.put(bike8.getBikeID(), bike8);





        /*station2.addBike(bike3.getBikeID());

        System.out.println(station1.getBikes());*/

        Station station1 = new Station("1.Bezirk");
        Station station2 = new Station("15.Bezirk");
        Station station3 = new Station("20.Bezirk");

        HashMap<Integer, Station> stations = new HashMap<Integer, Station>();
        stations.put(station1.getStationID(), station1);
        stations.put(station2.getStationID(), station2);
        stations.put(station3.getStationID(), station3);

/*(10) Demonstrate the usage of addBike(...)  method by c
alling it in your main() method (put 3 bikes in Station1, and put 4 bikes in Station2)*/

        station1.addBike(bike1.getBikeID());
        station1.addBike(bike2.getBikeID());
        station1.addBike(bike3.getBikeID());

        station2.addBike(bike4.getBikeID());
        station2.addBike(bike5.getBikeID());
        station2.addBike(bike7.getBikeID());
        station2.addBike(bike6.getBikeID());

        station2.removeBike(bike5.getBikeID());

        System.out.println(station2.getBikes());


        /*UserZ rents a bike bikeX from stationY1
        bikeX is removed from the data of that Station, and connected to a userZ
        userZ returns a bike to stationY2
*/

        User user1 = new User("Sebastian", "Simic");
        User user2 = new User("David", "Fellhofer");
        User user3 = new User("Maria", "Rainer");


        User userZ = new User( "Christian", "Simic");
        Bike bikeX = new Bike("Yellow", "CanBeRented");
        Station stationY1 = new Station("1.Bezirk");
        Station stationY2 = new Station("15.Bezirk");

        stationY1.addBike(bikeX.getBikeID());
        stationY1.addBike(bikeX.getBikeID());
        stationY1.addBike(bikeX.getBikeID());
        stationY1.addBike(bikeX.getBikeID());
        stationY1.addBike(bikeX.getBikeID());
        stationY1.addBike(bikeX.getBikeID());

        System.out.println(stationY1.getBikes());
        stationY1.removeBike(bikeX.getBikeID());
        System.out.println(stationY1.getBikes());

        userZ.setCurrentlyRentedBike(bikeX.getBikeID());
        userZ.removeBikeFromUser();
        stationY2.addBike(bikeX.getBikeID());











    }
}
