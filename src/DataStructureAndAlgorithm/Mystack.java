package DataStructureAndAlgorithm;

public class Mystack {
    private int variable;
    String [] elements;
    public Mystack( int sizeOfStack) {
        elements = new String[sizeOfStack];
    }

    public boolean isEmpty() {
        if (variable == 0){
            
        }
        return true;
    }

    public void push(String element) {
     elements[variable] += element;
     variable++;
    }
    public String  pop(String element){
        variable--;
       return elements[variable];
    }

}
