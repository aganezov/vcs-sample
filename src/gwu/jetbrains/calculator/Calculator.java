package gwu.jetbrains.calculator;


import java.util.Random;

public class Calculator {
    public static void printRandomInteger(){
        System.out.println(new Random().nextInt());
    }
    public void printRandomLong(){
        System.out.println(new Random().nextLong());
    }
    public void printRandomDouble(){
        System.out.println(new Random().nextDouble());
    }
}
