  public static int setIthBit(int n, int i){
        int bitMark = 1<<i;
        return n | (bitMark); 
    }