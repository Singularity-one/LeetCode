import java.util.Stack;

/*

*/

public class e155_Min_Stack {
	//#1
//    int min = Integer.MAX_VALUE;
//    Stack<Integer> stack = new Stack<Integer>();
//    public void push(int x) {
//        // only push the old minimum value when the current 
//        // minimum value changes after pushing the new value x
//        if(x <= min){          
//            stack.push(min);
//            min=x;
//        }
//        stack.push(x);
//    }
//
//    public void pop() {
//        // if pop operation could result in the changing of the current minimum value, 
//        // pop twice and change the current minimum value to the last minimum value.
//        if(stack.pop() == min) min=stack.pop();
//    }
//
//    public int top() {
//        return stack.peek();
//    }
//
//    public int getMin() {
//        return min;
//    }
	
	//#2
    public Elem top;
    
    /** initialize your data structure here. */
    public e155_Min_Stack() {
 
    }
 
    public void push(int x) {
        if(top == null){
            top = new Elem(x, x);
        }else{
            Elem e = new Elem(x, Math.min(x,top.min));
            e.next = top;
            top = e;
        }
 
    }
 
    public void pop() {
        if(top == null)
            return;
        Elem temp = top.next;
        top.next = null;
        top = temp;
 
    }
 
    public int top() {
        if(top == null)
            return -1;
        return top.value;
    }
 
    public int getMin() {
        if(top == null)
            return -1;
        return top.min;
    }

}

class Elem{
    public int value;
    public int min;
    public Elem next;
 
    public Elem(int value, int min){
        this.value = value;
        this.min = min;
    }
}

//參考http://glj8989332.blogspot.com/2019/09/leetcode-155-min-stack.html