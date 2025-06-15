package OOPs.Generics;

import java.util.Arrays;

public class customArrayList {
    private int []data;
    private  static int DEFAULT_SIZE = 5;
    private int size = 0; // also working as index value

    public customArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }
    public void add(int num){
        if (isFull()){
            resize();
        }
        data[size++]= num;
    }
    private boolean isFull(){
        return size == data.length;
    }

    private void resize(){
        int[]temp = new int[data.length * 2];
//        copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }
    public int remove (){
        int removed = data[--size];
        return removed;
    }
    public int get(int index){
        return data[index];
    }
    public void set(int index, int value){
        data[index] = value;
    }
    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }

    public static void main(String[] args) {
        customArrayList list = new customArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(3 * i);
        }
        System.out.println(list);
    }
}
