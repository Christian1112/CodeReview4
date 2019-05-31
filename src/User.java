public class User {


    private int userID;
    private String name;
    private String surname;
    private int currentlyRentedBike;
    static int counter = 0;

    public User(String name, String surname){

        this.userID = counter;
        this.name = name;
        this.surname = surname;


        counter+=1;
    }

    public void setCurrentlyRentedBike(int bikeID){
        this.currentlyRentedBike = bikeID;
    }

    public void removeBikeFromUser (){
       currentlyRentedBike = -1;
    }

}
