package Stack;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr  =-1;
    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size){
        this.data = new int[size];
    }
    public boolean isFull(){
        return ptr==data.length-1;
    }
    public boolean isEmpty(){
        return ptr==-1;
    }
    public boolean push(int value){
        if (isFull()) {
            System.out.println("Stack is full");
        }
        ptr++;
        data[ptr]=value;
        System.out.println(value + " pushed");
        return true;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        return data[ptr--];
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        return data[ptr];
    }

}
