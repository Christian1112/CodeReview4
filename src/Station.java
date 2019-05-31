import java.util.ArrayList;
import java.util.List;

public class Station {


    public int getStationID() {
        return stationID;
    }

    private int stationID;
    private String location;
    static int counter = 0;

    public List<String> getBikes() {
        return bikes;
    }

    private List<String> bikes = new ArrayList<String>();


    public Station( String location){

        this.stationID = counter;
        this.location = location;
        counter +=1;
    }



    public void addBike(int bikeID){
        if (bikes.size() < 5){
            bikes.add(Integer.toString(bikeID) );
        } else {
            System.out.println("Station is full");
        }
    }

    public void removeBike( int bikeID){
        bikes.remove(Integer.toString(bikeID));
    }


}
