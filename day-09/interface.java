//Interface

interface Animal{
    void sound();
}
class dog implements Animal{
    public void sound(){
        System.out.println("Dog Barks");
    }
}
class cat implements Animal{
    public void sound(){
        System.out.println("Cat Meows");
    }
}

class interface5 {
    public static void main(String[] args) {
        Animal a = new dog();
        a.sound();
        a = new cat();
        a.sound();
    }
    
}
