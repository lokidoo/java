package practice;

public class Main {

    public int i;
    public static void main(String[] args) {
     
        for (int i = 10; i < 20; i += 2) {
            if (i > 15)
                break;
            if (i % 4 == 0)
                continue;
            System.out.println (i);
        }
        // Person person = new Person();
        // Person person1 = new Person();
        // Person person2 = new Person();
        // Person person3 = new Person();
        
        // Person.getCount();

        // DB db = new DB();
        // info("Gay");

    // Car kia = new Car(250.5f, 2500, "pink", new byte[]{0, 0, 0});
    // kia.engine.setValues(true, 1328);
    // kia.engine.info();

    // Truck truck = new Truck (5600, new byte[]{100, 0, 100}, true);
    // truck.engine.setValues(false, 6805);
    // truck.engine.info();
   
    
    // Car flyCar = new Car(250.5f, 2500, "pink", new byte[]{0, 0, 0}){
   
    //     @Override
    //     public void moveObject(float speed){
    //         super.moveObject(speed);

    //         this.engine.isReady(true);
    //         System.out.println("Машина летит ");
             
    //     }
    // };
    // flyCar.moveObject(300.05f);
    }

public static void info(){
    System.out.println("Hello!");
} 

public static void info(String word){
    System.out.println(word + "! ");
} 

}
