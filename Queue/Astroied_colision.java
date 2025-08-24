import java.util.*;

public class Astroied_colision {

    public static List<Integer> asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        int n = asteroids.length;
        for(int i = 0 ;i<n;i++){
            if(stack.isEmpty()){
                stack.push(asteroids[i]);
                
            }
            else if(asteroids[i]>0){
                stack.push(asteroids[i]);
            }
            else{
              if(!stack.isEmpty()&& stack.peek()<0){
                stack.pop();
              }
              if(!stack.isEmpty()&&stack.peek()>Math.abs(asteroids[i])) continue;

              while (!stack.isEmpty()&& stack.peek()>0&&stack.peek()<Math.abs(asteroids[i])) {
                stack.pop();
              }
              if (!stack.isEmpty()&&stack.peek()>0&&stack.peek()==Math.abs(asteroids[i])) {
                stack.pop();
              }
              else{
                stack.push(asteroids[i]);
              }

            }



        }


        List<Integer> ans = new ArrayList<>();
        while (!stack.isEmpty()) {
            ans.add(stack.pop());
            
        }

        return ans;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] asteroids = new int[n];
        for (int i = 0; i < n; i++) {
            asteroids[i] = scanner.nextInt();
        }

        List<Integer> ans = asteroidCollision(asteroids);

        if (ans.isEmpty()) {
            System.out.print(-1);
        } else {
            for (int asteroid : ans) {
                System.out.print(asteroid + " ");
            }
        }
    }
}
