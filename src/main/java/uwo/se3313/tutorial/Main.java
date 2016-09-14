package uwo.se3313.tutorial;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<IMyClass> list = new ArrayList<>();
        list.add(new MyClass(5, 10.0));

        System.out.println("list = " + list);
    }
}
