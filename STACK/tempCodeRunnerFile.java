    public static void maxAreaHisto(int arr[]){
        int maxArea = 0;
        int nsr [] = new int[arr.length];
        int nsl [] = new int[arr.length];
        //next smallest right 
        Stack <Integer> st = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            } 
            if(!st.isEmpty()){
                nsr[i] = arr.length;
            } else {
                nsr[i] = st.peek();
            }
            st.push(i);
        }

        // NEXT SMALLEST IN LEFT 
         st = new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            } 
            if(!st.isEmpty()){
                nsl[i] = -1;
            } else {
                nsl[i] = st.peek();
            }
            st.push(i);
        }
        // CURRENT AREA : width = j-i-1 : nsr[i]-nsl[i]-1
        for(int i=0;i<arr.length;i++){
            int height = arr[i];
            int width = nsr[i]-nsl[i]-1;
            int currArea = height * width;
            maxArea = Math.max(currArea, maxArea);
        }
        System.out.println("Maximum area of Histogram = "+maxArea);

    }