package stack;
import java.util.Stack;

public class NextSmall {
    
    public int[] NextSmallToRight(int [] arr){
        Stack<Integer> stack = new Stack<Integer>();
        int NextSmall [] = new int[arr.length];
        for(int i = arr.length-1 ; i >= 0 ; i--){
            while(!stack.isEmpty() && stack.peek() >= arr[i]){
                stack.pop();
            }

            if(stack.isEmpty()){
                NextSmall[i] = arr.length;
            } else {
                NextSmall[i] = i+1;
            }
            stack.push(arr[i]);
        }
        System.out.print('{');
        for(int i = 0 ; i < NextSmall.length ; i++){
            System.out.print(NextSmall[i]+" ");
            }
        System.out.print('}');
        return NextSmall;
            
    }

    public int[] NextSmallToLeft(int [] arr){
        Stack<Integer> stack = new Stack<Integer>();
        int NextSmall [] = new int[arr.length];
        for(int i = 0 ; i < arr.length ; i++){
            while(!stack.isEmpty() && stack.peek() >= arr[i]){
                stack.pop();
            }

            if(stack.isEmpty()){
                NextSmall[i] = -1;
            } else {
                NextSmall[i] = i-1;
            }
            stack.push(arr[i]);
        }
        System.out.print('{');
        for(int i = 0 ; i < NextSmall.length ; i++){
            System.out.print(NextSmall[i]+" ");
            }
        System.out.print('}');
        return NextSmall;
            
    }
    
}
