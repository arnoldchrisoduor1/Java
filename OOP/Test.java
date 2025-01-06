// The Bicycle class
public class Bicycle {
    public int gear;
    public int speed;

    // The Bicycle class has one constructor.
    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    // Creating methods for the Bicycle class.
    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    // toString() method to print info of Bicycle.
    public String toString() {
        return ("No of gears are " + gear + "\n" + "speed of bicycle is " + speed);
    }
}

// Derived class
class MountainBike extends Bicycle {
    // This subclass will add one more field.
    public int seatHeight;

    // It will have one constructor.
    public MountainBike(int gear, int speed, int seatHeight) {
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    // Adding one more method.
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    // Overriding the toString method to print more info.
    @Override
    public String toString() {
        return (super.toString() + "\nseat height is " + seatHeight);
    }
}

// The driver class
class Test {
    public static void main(String args[]) {
        MountainBike mb = new MountainBike(30, 100, 25);
        System.out.println(mb.toString());
    }
}
