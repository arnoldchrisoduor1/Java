public class Bicycle {
    public int gear;
    public int speed;

    // the Bicycle class has one constructor.
    public Bicycle(int gear, int speed)
    {
        this.gear = gear;
        this.speed = speed;
    }

    // Creating the methods for the Bucycle class.
    public void applyBrake(int decrement){
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    // toString() method to print info of Bicycle.
    public String toString(){
        return ("No of gears are " + gear + "\n" + "speed of bicycle is " + speed);
    }
}

// derived class
class MountainBike extends Bicycle {
    // this subclass will add one more field.
    public int seatHeight;

    // it will have one constructor.
    public MountainBike(int gear, int speed, int starHeight) {
        super(gear, speed);
        seatHeight = starHeight;
    }

    // we will add one more method.
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    // overriding the toString method to print more info.
    @Override public String toString(){
        return (super.toString() + "\nseat height is " + seatHeight);
    }
}

// The driver class
public class Test {
    public static void main(String args[])
    {
        MountainBike mb = 
    }
}
