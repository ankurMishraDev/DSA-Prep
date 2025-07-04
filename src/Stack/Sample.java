package Stack;

public class Sample {
    public static void main(String[] args) {
        CustomStack stack = new DynamicStack();
        stack.push(2);
        stack.push(9);
        stack.push(34);
        stack.push(12);
        stack.push(41);
        System.out.println(stack.pop() + " popped");
        System.out.println("Next stack element "+ stack.peek());
        System.out.println(stack.pop() + " popped");
        System.out.println(stack.pop() + " popped");
        System.out.println(stack.pop() + " popped");
    }
}
