package Heaps_and_Hashmap;

import java.util.ArrayList;
import java.util.Arrays;

public class Heaps<T extends Comparable<T>> {
    private final ArrayList<Integer> list;
    public Heaps(){
        list = new ArrayList<>();
    }
    public void swap(int f, int s){
        int temp = list.get(f);
        list.set(f,list.get(s));
        list.set(s,temp);
    }
    public int parentNode(int i){
        return (i-1)/2;
    }
    public int leftNode(int i){
        return (i*2)+1;
    }
    public int rightNode(int i){
        return (i*2)+2;
    }
    public void insert(int val){
        list.add(val);
        upHeap(list.size()-1);
    }
    private void upHeap(int i){
        if(i==0)return;
        int p = parentNode(i);
        if (list.get(i).compareTo(list.get(p))<0){
            swap(i,p);
            upHeap(p);
        }
    }


    public int removeEle() throws Exception{
        if (list.isEmpty()){
            throw new Exception("Removing element from an empty heap");
        }
        int temp = list.get(0);
        int last = list.remove(list.size()-1);
        if(!list.isEmpty()){
            list.set(0,last);
            downHeap(0);
        }
        return temp;
    }
    private void downHeap(int i ){
        int min = i;
        int left = leftNode(i);
        int right = rightNode(i);
        if(left<list.size()&&list.get(min).compareTo(list.get(left))>0){
            min = left;
        }
        if(right<list.size()&&list.get(min).compareTo(list.get(right))>0){
            min = right;
        }
        if(min!=i){
            swap(min, i);
            downHeap(min);
        }
    }
    public  ArrayList<Integer> heapSort() throws Exception{
        ArrayList<Integer> newList = new ArrayList<>();
        while(!list.isEmpty()){
            newList.add(this.removeEle());
        }
        return newList;
    }

    public void printHeap() {
        if (list.isEmpty()) {
            System.out.println("Heap is empty");
            return;
        }
        System.out.print("Heap elements: ");
        for (int val : list) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
    public ArrayList<Integer> maxHeap(ArrayList<Integer> unsorted) throws Exception{
        int n = unsorted.size();
        maxHeap heap = new maxHeap();
        while(!unsorted.isEmpty()){
            heap.insertMaxHeap(unsorted.remove(0));
        }
        for(int i=0;i<n;i++){
        unsorted.add(heap.removeEle());
        }
        return unsorted;
    }

    public static void main(String[] args) throws Exception {
        Heaps heap = new Heaps();
        int[]nums = {23,5,7,2,54,7,3,4};
        for (int i = 0; i < nums.length ; i++) {
            heap.insert(nums[i]);
        }
        heap.printHeap();
        System.out.println("Removed root node: "+ heap.removeEle());
        ArrayList sortedList = heap.heapSort();
        System.out.println("Minimum value heap: " + sortedList);
        ArrayList<Integer> maxHeap = heap.maxHeap(sortedList);
        System.out.println("Max value heap: " + maxHeap);
    }
    class maxHeap{
        ArrayList<Integer> list;

        public maxHeap() {
            list = new ArrayList<>();
        }

        public void insertMaxHeap(int val) {
            list.add(val);
            upHeapMaxHeap(list.size() - 1);
        }

        private void upHeapMaxHeap(int i) {
            if (i == 0) return;
            int p = parentNode(i);
            if (p >= 0 && p < list.size() && list.get(i).compareTo(list.get(p)) > 0) {
                swap(i, p);
                upHeapMaxHeap(p);
            }
        }

        public int removeEle() throws Exception {
            if (list.isEmpty()) {
                throw new Exception("Removing element from an empty heap");
            }
            int temp = list.get(0);
            int last = list.remove(list.size() - 1);
            if (!list.isEmpty()) {
                list.set(0, last);
                downHeap(0);
            }
            return temp;
        }

        private void downHeap(int i) {
            int max = i;
            int left = leftNode(i);
            int right = rightNode(i);

            if (left < list.size() && list.get(max).compareTo(list.get(left)) < 0) {
                max = left;
            }
            if (right < list.size() && list.get(max).compareTo(list.get(right)) < 0) {
                max = right;
            }
            if (max != i) {
                swap(max, i);
                downHeap(max);
            }
        }

        private int parentNode(int i) {
            return (i - 1) / 2;
        }

        private int leftNode(int i) {
            return 2 * i + 1;
        }

        private int rightNode(int i) {
            return 2 * i + 2;
        }

        private void swap(int i, int j) {
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
    }
}
