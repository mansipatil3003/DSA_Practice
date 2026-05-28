//Abstraction

abstract class vehicle{
    abstract void start();
    public void stop(){
        System.out.println("Vehicle Stopped");
    }
}
class Car extends vehicle{
    void start(){
        System.out.println("Car start with key");
    }
}

class Bike extends vehicle{
    void start(){
        System.out.println("Bike start with key");
    }
}
class Main2{

    public static void main(String[] args) {
        vehicle v1 = new Car();
        vehicle v2 = new Bike();
        v1.start();
        v1.stop();
        v2.start();

    }
}


