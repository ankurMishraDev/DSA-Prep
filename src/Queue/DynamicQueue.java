package Queue;

public class DynamicQueue extends CircularQueue{
    public DynamicQueue(){
        super();
    }
    @Override
    public boolean add(int value){
        if(this.isFull()){
            int[] temp = new int[data.length*2];
            for (int i = 0; i < data.length ; i++) {
                temp[i]= data[(front + i)%data.length];
            }
            front = 0;
            end = data.length;
            data = temp;
        }
        return super.add(value);
    }
}
