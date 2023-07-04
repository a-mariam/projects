package DataStructureAndAlgorithm;

import java.util.Arrays;

public class Queue {
    String [] elements;
    int index;

    public Queue(int sizeOfQueue) {elements = new String[sizeOfQueue];
    }

    public static boolean isEmpty() {
        return true;
    }

    public  void enQueue(String element) {
        elements[index] = element;
        index++;
        System.out.println(Arrays.toString(elements));
    }

    public void deQueue(String element) {
        elements[index] = null;
        System.out.println(Arrays.toString(elements));
    }
}
