
//SHALLOW COPY
class Student{
   int arr[];

    Student(int arr[]){ //student constructor using student object
        this.arr = arr;
    }

    Student(Student obj){
      this.arr = obj.arr;
    }

    void display(){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}



public class OopsPS {

     public static void main(String []args){
        int a[] = {10, 20, 30};
        Student obj = new Student(a);
        Student s2 = new Student(obj);
        obj.display();
        s2.display();

        a[0] = 40;
        a[1] = 40;
        a[2] = 40;
        obj.display();
        s2.display();




        // Student s1 = new Student("OM PANDEY", 55);
        // // System.out.println(s1.name);
        // // System.out.println(s1.rollNumber);

        // Student s2 = new Student(s1);
        // System.out.println(s2.name);
        // System.out.println(s2.rollNumber);






    //     //POWER FUNCTION 
    //     int a = 2, n = 8;
    //     int ans = 1;
        
    //     while(n>0){
    //         if(n%2==1){
    //             ans = ans*a;
    //         }
    //         n = n/2;
    //         a = a*a;

    //     }
    //     System.out.println("a to the power b is = "+ans);
}

}