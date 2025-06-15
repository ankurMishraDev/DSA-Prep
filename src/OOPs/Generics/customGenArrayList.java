package Generics;

import java.util.Arrays;

//here T should either be from Number class or ites subclasses
public class customGenArrayList < T extends Number >{
    private Object []data;
    private  static int DEFAULT_SIZE = 5;
    private int size = 0; // also working as index value

    public customGenArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }
    public void add(T num){
        if (isFull()){
            resize();
        }
        data[size++]= num;
    }
    private boolean isFull(){
        return size == data.length;
    }

    private void resize(){
        Object[]temp = new Object[data.length * 2];
//        copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }
    public T remove (){
        T removed = (T)data[--size];
        return removed;
    }
    public T get(int index){
        return (T)data[index];
    }
    public void set(int index, T value){
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
        customGenArrayList list = new customGenArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(3 * i);
        }

        System.out.println(list);
    }
}
