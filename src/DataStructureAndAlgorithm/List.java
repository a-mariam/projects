package DataStructureAndAlgorithm;

import java.util.Arrays;

public class List {

    int size;
    int index ;
    int indexx;
    String [] fruit;
    public List(int size){
        fruit = new String[size];
    }


    public boolean isEmpty(){
        if (index != 0 ){
            return false;
        }
        return true;
    }
    public void add(int index, String element){
        fruit[indexx] = element;
        indexx++;

        System.out.println(Arrays.toString(fruit));
    }

    public int size() {
//        int counter = 0;
//        for (int count = 0; count <= fruit.length - 1; count++){
//            counter += count;
//        }
//        System.out.println(counter);
//        return counter;
        return indexx;
    }

    public void clear() {
        for (int count = 0; count< fruit.length ; count++){
            fruit[count] = String.valueOf(0);
        }
        System.out.println(Arrays.toString(fruit));
    }


    public void remove(int index) {
        indexx =indexx - index ;
//    fruit[index] = null;
    }
}
