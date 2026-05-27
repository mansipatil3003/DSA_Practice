//Abstraction

abstract class Appliance {
    abstract void turnOn(); 
    public void turnOff(){
        System.out.println("Appliance off");
    }
}
class Fan extends Appliance{
    void turnOn(){
        System.out.println("Fan rotated");
    }
}
class Tv extends Appliance{
    @Override
    void turnOn(){
        System.out.println("Tv started");
    }
}

public class Appliance1 {
    public static void main(String[] args) {
        Fan f = new Fan();
        Tv T = new Tv();
        f.turnOn();
        T.turnOn();
    }
}