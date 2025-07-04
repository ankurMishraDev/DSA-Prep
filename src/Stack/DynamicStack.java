package Stack;

public class DynamicStack extends CustomStack{
    public DynamicStack(){
        super();
    }
    @Override
    public boolean push(int value){
        if(this.isFull()){
            int [] temp = new int[data.length*2];
            for (int i = 0; i < data.length-1; i++) {
                temp[i]= data[i];
            }
            data = temp;
        }
        return super.push(value);//here we the stack is not full so we can insert the element
    }
}
