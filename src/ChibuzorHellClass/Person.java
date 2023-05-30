package ChibuzorHellClass;

import java.util.ArrayList;

public class Person {
private ArrayList<TypeOfProblem> problem = new ArrayList<>();
public void addProblem(TypeOfProblem type){
    problem.add(type);
}
public void solveProblem(TypeOfProblem type){
    problem.remove(type);
}
public String getProblem(){
    return problem.toString();
}

}
