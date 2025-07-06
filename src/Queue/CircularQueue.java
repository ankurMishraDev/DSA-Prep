package Queue;

public class CircularQueue {
    protected int [] data;
    private static final int Default_Size = 11;
    protected int front, end = 0;
    private int size =0;
    public CircularQueue(int size){
        this.data = new int[size];
    }
    public CircularQueue(){
        this(Default_Size);
    }
    public int queueSize(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public boolean isFull(){
        return size == data.length;
    }
    public boolean add(int value){
        if(isFull()){
            System.out.println("Queue is Full");
            return false;
        }
        data[end++]= value;
        end %= data.length;
        size++;
        return true;
    }
    public boolean remove(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return false;
        }
        int removedElement = data[front++];
        front %= data.length;
        size--;
        return true;
    }
    public void print(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        int i = front;
        do{
            System.out.print(data[i++]+" -> ");
            i%= data.length;
        }while (i!=end);
        System.out.println("END");
    }
}
