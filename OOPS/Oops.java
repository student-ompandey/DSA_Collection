// class BankAccount{
//     public String username;
//     private String password;

//     public void setPassword(String pwd){
//         password = pwd;
//     }
// }

 //GETERS AND SETTERS 
// class Pen{
//     private String color;
//     private int tip;

//     String getColor(){ // getters 
//         return this.color;
//     }

//     int getTip(){
//         return this.tip;   //this keyword is used to refer to the current object
//     }

//     void setColor(String newColor){ // setters 
//         this.color = newColor;
//     }

//     void setTip(int newTip){
//         this.tip = newTip;
//     }
// }

// CONSTRUCTOR 
// class Student{
//     String name;
//     int rollNumber;
//     String password;
//     int marks[];

//     //SHALLOW COPY CONSTRUCTOR 
//     // Student(Student s1){
//     //     marks = new int[3];
//     //     this.name = s1.name;
//     //     this.rollNumber = s1.rollNumber;
//     //     this.marks = s1.marks;
//     // }

//     //DEEP COPY CONSTRUCTOR 
//     Student(Student s1){
//         marks = new int[3];
//         this.name = s1.name;
//         this.rollNumber = s1.rollNumber;
//         for(int i=0;i<marks.length;i++){
//             this.marks[i] = s1.marks[i];
//         }
//     }

//     Student(){
//         marks = new int[3];
//         System.out.println("Constructor is called...."); //unpairameteraized constructor
//     }
//     Student(String name){
//         marks = new int[3];
//         this.name = name ;  // pairameteraized constructor 
//     }
//     Student(int rollnumber){
//         marks = new int[3];
//         this.rollNumber = rollNumber;
//     }
// }

//INHERITANCE
//base class
// class Animal{
//     String color;

//     void eat(){
//         System.out.println("eat");
//     }

//     void breathe(){
//         System.out.println("breathes");
//     }
// }

// class Mamal extends Animal{
//     int leg ;
// }

// class Dog extends Mamal{
//     String bark;
// }

// class Dog extends Animal{
//     String bark;
// }

// class Cat extends Animal{
//     String bark;
// }



//parent class
// class Fish extends Animal{
//     int fins;

//     void swim(){
//         System.out.println("Swim");
//     }
// }

class Claculator{
    int sum(int a, int b){
        return a+b;
    }

    float sum(float a, float b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return  a+b+c;
    }
}

class Animal{
    void eat(){
        System.out.println("Eating");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("Grass Eating");
    }
}

public class Oops {
    public static void main(String[] args){
        //GETTERS AND SETTERS 
    //     Pen p1 = new Pen();
    //    // p1.setColor("blue");
    //    p1.setColor("blue");
    //   System.out.println(p1.getColor()) ;
    //    p1.setTip(5);
    //    System.out.println(p1.getTip());

        // BankAccount myacc = new BankAccount();
        // myacc.username = "Amit kuamar pandey";
        // myacc.setPassword("ompandey");
        // System.out.println(myacc.username);
        
         
        //CONSTRUCTOR 
        // Student s1 = new Student();
        // Student s2 = new Student("Om Pandey");
        // Student s3 = new Student(44);

        // Student s1 = new Student();
        // s1.name = "om pandey";
        // s1.rollNumber = 23;
        // s1.password = "Ompandey@2008";
        // s1.marks[0] = 100;
        // s1.marks[1] = 89;
        // s1.marks[2] = 90;

        // Student s2 = new Student(s1); //copy the values of s1 in s2 
        // s2.password = "yxz";
        // s1.marks[2] = 33;

        // for(int i=0;i<3;i++){
        //     System.out.println(s2.marks[i]);
        // }

       
        // Fish shark = new Fish();
        // shark.eat();

        // Dog d = new Dog();
        // d.eat();
        // d.leg = 3;
        // System.out.println(d.leg);

        //METHOD OVERLODING 
        // Claculator c = new Claculator();
        // System.out.println(c.sum(3, 4));
        // System.out.println(c.sum((float)3.4,  (float)4.6));
        // System.out.println(c.sum(3, 4, 7));

        //METHOD OVERRIDING 
        Deer d = new Deer();
        d.eat();


    }
}





