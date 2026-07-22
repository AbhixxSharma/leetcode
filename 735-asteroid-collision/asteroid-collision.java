

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        
        for (int num : asteroids) {
            boolean exploded = false;
            
           
            while (!st.isEmpty() && st.peek() > 0 && num < 0) {
                if (st.peek() < Math.abs(num)) {
                    st.pop();
                    continue; 
                } else if (st.peek() == Math.abs(num)) {
                    st.pop(); 
                    exploded = true;
                    break;
                } else {
                    exploded = true; 
                    break;
                }
            }
            
            if (!exploded) {
                st.push(num);
            }
        }
        
        int[] result = new int[st.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = st.pop();
        }
        
        return result;
    }
}

    