import java.util.Stack;

public class stacks {
    public void stack(){

        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.add(6);
        //pop() deletes the last element from the stack lifo
        stack.pop();
        System.out.println(stack);

        //peek() displays the top most element from the stack(in stack)
        System.out.println(stack.peek());
    //remaining methods same as arraylist
    }
public static void main(String[] args) {
    
    stacks s = new stacks();
    s.stack();
}
}
