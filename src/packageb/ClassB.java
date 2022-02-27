package packageb;

import com.company.BinarySearch;
import packagea.ClassA;

import java.io.PrintStream;

public class ClassB {

    public static void DemoClasses(String[] args) {
        final ClassA a = new ClassA();
        a.t = 1;
        //a = new ClassA(); //cannot assign a value to final variable a
        System.out.println("Got it");
    }

}
