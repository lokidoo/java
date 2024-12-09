package practice;

public class Person {

    private static int count;

    protected  Person(){
        count++;
    }

    protected  static void getCount(){
        System.out.println("Количество: " + count);
    }

}
