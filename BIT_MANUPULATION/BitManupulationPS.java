public class BitManupulationPS {
    public static void main(String[]args){
        // int x = 75;
        // x =( x|(1<<6));
        // System.out.println(x);

        //PRACTICE QUESTION 1 swaping two numbers without using extra variable 
        // int a = 23;
        // int b = 45;
        // // before swaping 
        // System.out.println("the value of a = "+a);
        // System.out.println("the value of b = "+b);
        //swap this numbers 
        //  a = a^b;
        //  b = a^b;
        //  a = a^b;
         //after swaping 
        //  System.out.println("After Swaping......");
        //  System.out.println("the value of a = "+a);
        //  System.out.println("the value of b = "+b);

         //PROBLEM NUMBER 3 
        //  int x = 5;
        //  x = -~5;
        //  System.out.println(x);

        //PROBLEM NUMBER 4 
        for(char ch='A';ch<='Z';ch++){
            System.out.print((char)(ch | ' '));
        }
    }
}
