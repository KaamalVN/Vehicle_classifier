class Vehicle{
    public void start(){
        System.out.println("Vehicle Started");
    }
    public void stop(){
        System.out.println("Vehicle Stopped");
    }
}

class Car extends Vehicle{
    public void start(){
        System.out.println("Car Started");
    }
    public void stop(){
        System.out.println("Car Stopped");
    }
}
class MotorCycle extends Vehicle{
    public void start(){
        System.out.println("Motor cycle Started");
    }
    public void stop(){
        System.out.println("Motor cycle Stopped");
    }
}
public class Vehicle_Classifier {
    public static void main(String[] args) {
        Car car=new Car();
        car.start();
        car.stop();
        MotorCycle motorCycle=new MotorCycle();
        motorCycle.start();
        motorCycle.stop();

    }
}