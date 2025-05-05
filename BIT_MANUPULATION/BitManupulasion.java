public class BitManupulasion {

    //NUMBER IS ODD OR EVEN 
    // public static void oddOrEven(int n){
    //     int bitMask = 1;
    //     if((n & bitMask)==0){
    //         System.out.println("Even number");
    //     } else{
    //         System.out.println("Odd number");
    //     }
    // }
    // GET ITH BIT 
    // public static int getithBit(int n, int i){
    //     int bitmark = 1<<i;
    //     if((n & bitmark)==0){
    //         return 0;
    //     } else {
    //         return 1;
    //     }
    // }


    //SET ITH BIT 
    public static int setIthBit(int n, int i){
        int bitMark = 1<<i;
        return n | (bitMark); 
    }

    //CLEAR ITH BIT 
    public static int clearithBit(int n, int i){
        int bitMark = ~(1<<i);
        return n & bitMark;
    }

    public static int updateIthBit(int n, int i, int newBit){
        if(newBit==0){
            return clearithBit(n, i);
        } else{
            return setIthBit(n, i);
        }
    }

    public static int clearIthsBeat(int n, int i){
        int Bitmask = (~0)<<i;
        return n & Bitmask;
    }

    //CLAER BEAT IN RANGE 
    public static int clearBeatInRange(int n, int i, int j){
        int a = (~0)<<(j+1);
        int b = (1<<i)- 1;
        int bitMarks = a|b;
        return n & bitMarks;
    }

    // POWER OF TWO OR NOT 
    public static boolean isPowerOfTwo(int n){
        return (n&(n-1)) == 0;
    }

    //COUNT SET BIT 
    public static int countSetBit(int n){
        int count = 0;
        while(n>0){
            if((n&1) != 0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }

    //POWER CALCULATE 
    public static int powerCalculate(int a, int n){
        int ans = 1;
        while(n>0){
            if((n&1)!=0){
                ans = ans * a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }



    public static void main(String []args){
        //BINARY AND OPERATOR 
        //System.out.println(5&6);
        //BINARY OR 
        //System.out.println(5|6);
        //XOR OPERATOR 
        //System.out.println(5^6);
        //ONES COMPLEMENT OPERATOR 
        //System.out.println(~5);
        // System.out.println(~0);

        //LEFT SHIFT
        //System.out.println(5<<2);

        //RIGHT SHIFT 
        // System.out.println(6>>1);

        //Odd even 
        // oddOrEven(3);
        // oddOrEven(4);
        // oddOrEven(5);

        //GET ITH BIT
        //System.out.println(getithBit(10, 3));    
        
        //Set bitMark
        // System.out.println(setIthBit(10, 2));

        //CLEAR ITH BIT 
        // System.out.println(clearithBit(10, 1));

        //update ith bit 
        // System.out.println(updateIthBit(10, 2, 1 ));

        //CLEAR ITHS BIT 
        //System.out.println(clearIthsBeat(15, 2 ));

        //Range in clear 
       // System.out.println(clearBeatInRange(10, 2, 4 ));

       //IS POWER OF TWO OR NOT 
      // System.out.println(isPowerOfTwo(7));

      //count set bit 
    //   System.out.println(countSetBit(10));

    //POWER CALCULATE 
    System.out.println(powerCalculate(3, 5));

        
    }
}
