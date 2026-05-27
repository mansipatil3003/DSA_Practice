class Vehicle{
    String brand = "Generic";
    void honk(){
        System.out.println("Beep Beep");
    }
}
class Car extends Vehicle{
    String model = "Sedan";
    void showDetails(){
        System.out.println(brand + " " + model);
    }
}

class example_2 {
    public static void main(String[] args) {
        Car c = new Car();
        c.honk();
        c.showDetails();
    }
    
}
