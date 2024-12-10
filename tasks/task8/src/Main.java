

public class Main {
    public static void main(String[] args) throws Exception {

        Person p1 = new Person();
        Person p2 = new Person();
        //Person p3 = new Person();
        //Person p4 = new Person();

        p1.setInfo("Dimon", (byte) 25, "skorobachdima@gmail.com");
        p2.setInfo("Selbusha", (byte) 22, "selbusha@gmail.com");

        p1.printInfo();
        p2.printInfo();

    }
}
