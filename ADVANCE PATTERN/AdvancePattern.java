
public class AdvancePattern {
    //HOLLOW RACTENGLE
    // public static void hollowRactengle(int no_rows, int no_column){
    //     for(int i=1;i<=no_rows;i++){
    //         for(int j=1;j<=no_column;j++){
    //             if(i==1 || i==no_rows || j==1 || j==no_column){
    //                 System.out.print("*");
    //             }
    //             else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }

    // }

    //INVERTED ROTATED HALF PIRAMID 
    // public static void rotated_half_pyramid(int n){
    //     //this loop use for number of line 
    //     for(int i=1;i<=n;i++){

    //         //this loop use for number of spaces 
    //         for(int j=1;j<=n-i;j++){
    //             System.out.print(" ");
    //         }
    //         //this loop use for number of star
    //         for(int k=1;k<=i;k++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    //INVERTED HALFpYRAMID WITH NUMBER
    // public static void inverted_half_pyramid_withNumber(int n){
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=n-i+1;j++){
    //             System.out.print(j +" ");
    //         }
    //         System.out.println();
    //     }
    // }

    // FLOYDS TRINGLE
    // public static void floyds_tringle(int n){
    //     int counter = 1;
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=i;j++){
    //             System.out.print(counter+" ");
    //             counter++;
    //         }
    //         System.out.println();
    //     }

    // }

    //O-1 TRINGLE 
    // public static void zero_one_tringle(int n){
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=i;j++){
    //             if((i+j)%2==0){
    //                 System.out.print(1);
    //             }
    //             else{
    //                 System.out.print(0);
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    //BUTTERFLY PATTERN

    // public static void butterFly(int n){
    //     //Acending order 
    //     //no of line 
    //     for(int i=1;i<=n;i++){
    //         //stars
    //         for(int j=1;j<=i;j++){
    //             System.out.print("*");
    //         }
    //         //spaces
    //         for(int k=1;k<=2*(n-i);k++){
    //             System.out.print(" ");
    //         }
    //         //star
    //         for(int j=1;j<=i;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    //     //Decending order 
    //     for(int i=n;i>=1;i-- ){
    //         for(int j=1;j<=i;j++){
    //             System.out.print("*");
    //         }
    //         for(int k=1;k<=2*(n-i);k++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1;j<=i;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
            
    //     }
    // }

    //SOLID RHOMBUS PATTERN 
    // public static void rhombusPattern(int n){
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=n-i;j++){
    //             System.out.print(" ");
    //         }
    //         for(int k=1;k<=n;k++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    //HOLLOW RHOMBUS TRINGLE 
    // public static void hollowrohbusRectengle(int n){
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=n-i;j++){
    //             System.out.print(" ");
    //         }
    //         for(int k=1;k<=n;k++){
    //             if(i==1||i==n||k==1||k==n){
    //                 System.out.print("*");
    //             } else{
    //                 System.out.print(" ");
    //             }
    //         }

    //         System.out.println();
    //     }
    // }

    //DIAMOND STRUCTURE
    public static void diamondStr(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*(i-1)+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*(i-1)+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }




    public static void main(String[] args) {
        //hollow ractengle
        // hollowRactengle(4, 5);

        //inverted rectangle
       // rotated_half_pyramid(4);

       //inverted half pyramid withnumber
       //inverted_half_pyramid_withNumber(5);

       //floyds tringle
      // floyds_tringle(5);

      //zero-one tringle
      //zero_one_tringle(5);

      //butterfly pattern
      //butterFly(8);

      //RHOMBUS PATTERN
      //rhombusPattern(5);

      //HOLLOW RHOMBUS PATTERN
      //hollowrohbusRectengle(5);

      //DIAMOND PATTERN
      diamondStr(5);
        
    }
}
