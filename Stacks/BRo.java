import java.util.*;

public class BRo {

    public static List<Integer> asteroidCollision(int[] asteroids) {
          Stack <Integer> st = new Stack<>();
          int n = asteroids.length;
          for(int i = 0 ; i<n;i++){

            if(st.isEmpty()){
                st.push(asteroids[i]);
            }
           else  if(asteroids[i] > 0){
                st.push(asteroids[i]);

            }
            else{
                if(!st.isEmpty()&& st.peek() < 0){
                    st.push(asteroids[i]);
                }
                
                
                if(!st.isEmpty()&&st.peek()<0){
                    st.push(asteroids[i]);
                    
                }
                while(!st.isEmpty()&& st.peek()<Math.abs(asteroids[i])){
                    st.pop();
                }
                if(!st.isEmpty()&& st.peek()>0&&st.peek()==Math.abs(asteroids[i])){
                   st.pop();                    
                }
               else {
                st.push(asteroids[i]);
                }
                
                }


            }

            List<Integer> a = new ArrayList<>();
            for(int i = 0 ; i< st.size();i++){
                a.add(st.pop());
            }

            return a;
          }
        
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] asteroids = new int[n];

        for (int i = 0; i < n; i++) {
            asteroids[i] = scanner.nextInt();
        }

        List<Integer> ans = asteroidCollision(asteroids); 

        if(ans.size()==0){
             System.out.print(-1);
        }else{
              for (int asteroid : ans) {
                 System.out.print(asteroid + " ");
              }
        }
    }

}

