public class Bike {


    public int getBikeID() {
        return bikeID;
    }
    static int counter = 0;

    private int bikeID;
    private String color;
    private String state;

    public Bike ( String color, String state){

        this.bikeID = counter;
        this.color = color;
        this.state = state;

        counter += 1;

    }
}
