package Queue;

public class Sample {
    public static void main(String[] args) {
        //Custom Queue
//        CustomQueue queue = new CustomQueue(6);
//        queue.add(3);
//        queue.add(4);
//        queue.add(1);
//        queue.add(5);
//        queue.add(6);
//        queue.add(12);
////        queue.add(15);
////        queue.add(9);
//        queue.display();
//
//        queue.remove();
//        System.out.println(queue.frontElement());
//        queue.display();

        //Circular Queue
//        CircularQueue cirQueue = new CircularQueue(5);
//        cirQueue.add(2);
//        cirQueue.add(7);
//        cirQueue.add(0);
//        cirQueue.add(12);
//        cirQueue.add(9);
//        cirQueue.print();
//        cirQueue.remove();
//        cirQueue.print();
//        cirQueue.add(23);
//        cirQueue.add(74);
//        cirQueue.print();
//        System.out.println(cirQueue.queueSize());

        //Dynamic Queue
        DynamicQueue dynamicQ = new DynamicQueue();
        dynamicQ.add(2);
        dynamicQ.add(4);
        dynamicQ.add(5);
        dynamicQ.add(1);
        dynamicQ.add(9);
        dynamicQ.add(6);
        dynamicQ.add(12);
        dynamicQ.add(94);
        dynamicQ.add(14);
        dynamicQ.print();
        dynamicQ.remove();
        dynamicQ.print();
    }
}
