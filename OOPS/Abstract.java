abstract class Animal{
    Animal(){
        System.out.println("Animal constructor called");
    }
    String color;
    void eat(){
        System.out.println("Eating");
    }
    abstract void Run();
}

class Horse extends Animal{
    Horse(){
        System.out.println("Haorse constructor called");
    }
    void changeColor(){
        color = "Dark brown";
    }
    void Run(){
        System.out.println("Horse is running");
    }
}

class Monkey extends Horse{
    Monkey(){
        System.out.println("Monkey constructor called");
    }
}

class Mamal extends Animal
{
    void changeColor(){
        color = "Dark red";
    }
    void Run(){
        System.out.println("Mamal is running");
    }
}



public class Abstract {
    public static void main (String [] args){
        Horse h = new Monkey();
        // h.eat();
        // h.Run();
        // System.out.println(h.color);

        // Mamal m = new Mamal();
        // m.eat();
        // m.Run();
        // System.out.println(m.color);
    }
}
