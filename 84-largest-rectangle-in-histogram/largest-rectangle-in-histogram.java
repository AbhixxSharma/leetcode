class Solution {
    public int largestRectangleArea(int[] heights) {
        int nse[]= new int[heights.length];
        int pse[]= new int[heights.length];
        Stack<Integer> st= new Stack<>();
        // Next Smaller element
        for(int i=heights.length-1;i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()]>= heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nse[i]=heights.length;
            }else{
               nse[i]=st.peek(); 
            }
            st.push(i);
        }
        Stack<Integer> st1= new Stack<>();

        // Previous smaller element
        for(int i=0;i<heights.length;i++){
            while(!st1.isEmpty() && heights[st1.peek()]>=heights[i]){
                st1.pop();

            }
            if(st1.isEmpty()){
                pse[i]=-1;

            }
            else{
                pse[i]=st1.peek();
            }
            st1.push(i);
        }

        // now we find the width of rectangele\
       
        int max=0;
        for(int i=0;i<heights.length;i++){
            int width= nse[i]-pse[i]-1;
            int area=heights[i]*width;
            max=Math.max(area,max);

        }
        return max;

        
    }
}