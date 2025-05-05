// interface cheesPlayer{
//     void moves();
// }

// class Queen implements cheesPlayer{
//     public void moves(){
//         System.out.println("up, down, left, right, diagonal");
//     }
// }

// class Horse implements cheesPlayer{
//     public void moves(){
//         System.out.println("Horse Moves");
//     }
// }

//SUPER KEYWORD 
class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor is called");
    }
}

class Horse extends Animal{
    Horse(){
        super.color = "red";
        //super();
        System.out.println("Horse constructor is called");
    }
}

public class Interface {
    public static void main(String [] args){
        // Queen q = new Queen();
        // q.moves();
        Horse h = new Horse();
        System.out.println(h.color);
        
    }
}
