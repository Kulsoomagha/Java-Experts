package day5com.blit;

public class Car {
//    color, doors,noOfWheel

//    always make the variables as private
//    we make variables as static when we know it will be common for all

    static int noOfWheels = 4;
    private String color;
    private int doors;

//  Constructor: we create constructors to restrict the object creation
//  this is a default constructor
    public Car() {
    }
// we can make other constructors according to our condition

//    METHODS:
//    we make setter = to set some values in the private variables
    public void setColor(String color) {
        this.color = color;
    }
    public void setDoors(int doors) {
        this.doors = doors;
    }

//    we make getter = to get the values we set to the variables back

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

//    all the classes will also carry some methods so we make methods:
//    methods will perform a specific task for us

    public void stop(){
        System.out.println("car is stopped");
    }

//    we make static methods : so that will be common to all
    static void driving(){
        System.out.println("car is driving");
    }

//
}
