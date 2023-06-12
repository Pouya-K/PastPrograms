/*
Names: Luka Jovanovic, Pouya Karimi, Sailesh Badri
Teacher: Mr. Gugoiu
Date: Nov. 14, 2022
Description: This class is made up of different methods which can change and give information on
             a queue as an array. The different methods include checking if the queue is full or
             empty, returning the size of the array, and the first and last element in the array.
             There are methods for adding and removing numbers from the que. The enqueue method
             will add a number to the back of the queue (front of the array), and the dequeue
             method will remove the number from the front of the queue (end of the array).
IDE: IntelliJ

Pouya: All printing statements and commenting, isFull(), isEmpty(), size()
Sailesh: Enqueue(), Rear()
Luka: Dequeue(), Front()
*/
import java.util.Arrays;
class MyQueue {

    static int capacity = 4;  // set the array maximum capacity
    static int[] arr = {};  // set the original array size

    public static boolean isFull() {
        return size() >= capacity;  // check if the size is greater than capacity
    }

    public static boolean isEmpty() {
        return size() <= 0;  // check if array is empty
    }

    public static int size() {
        return arr.length;  // get the size of array
    }

    public static int rear() {
        if (isEmpty()) {  // make sure queue isn't empty
            System.out.println("Queue is empty, couldn't fetch rear.");
            System.out.println();
            return -1;
        }
        else return arr[0];  // return first element of array
    }

    public static int front() {
        if (isEmpty()) {  // make sure queue isn't empty
            System.out.println("Queue is empty, couldn't fetch front.");
            System.out.println();
            return -1;
        }
        else return arr[size() - 1];  // return last element of array
    }

    public static void dequeue() {
        int fr = front();  // get first element of array
        if (isEmpty())  // make sure queue isn't empty
            System.out.println("Queue is empty. Try enqueueing new numbers.");
        else {
            System.out.println("Array before dequeue: " + Arrays.toString(arr));
            arr = Arrays.copyOf(arr, size() - 1);  // remove last element from array
            System.out.println("Array after dequeue: " + Arrays.toString(arr));
            System.out.println("Dequeued number is: " + fr);  // front of queue
            System.out.println();
        }
    }
    public static void enqueue(int n) {
        if (isFull()) {  // make sure queue isn't over capacity
            System.out.println("Error: Queue capacity of "+ capacity +" reached. Could not enqueue the element "+n);
            System.out.println();
            return;
        }
        System.out.println("Array before enqueue: "+ Arrays.toString(arr));
        int[] newArr = new int[size() + 1];  // increase array size by 1
        newArr[0] = n;  // make first element
        for (int i = 0; i < size(); i++) {  // fill rest of queue
            newArr[i + 1] = arr[i];
        }
        arr = newArr;  // redefine array
        System.out.println("Array after enqueue: "+ Arrays.toString(arr));
        System.out.println();
    }

    public static void main(String[] args) {
        enqueue(5);
        enqueue(-3);
        enqueue(-3);
        enqueue(-3);
        dequeue();
        enqueue(-4);
        enqueue(5);
        System.out.println("The front element of the queue is: " + front()+"\n");
        System.out.println("The rear element of the queue is: " + rear()+"\n");
        System.out.println("The array has " + size() + " elements.\n");
        if(isFull()) System.out.println("Queue is full.");
        dequeue();
        dequeue();
        dequeue();
        dequeue();
        if(isEmpty()) System.out.println("Queue is empty.");
    }
}