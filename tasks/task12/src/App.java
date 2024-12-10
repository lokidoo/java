import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
       
        List<Vehicle> vehicles = new ArrayList<>();
        
        vehicles.add(new Airplane(220, "белый"));
        vehicles.add(new Boat(70, "синий"));
        vehicles.add(new Car(80, "красный", "kia"));
        

        for (Vehicle trans : vehicles){
            trans.displayInfo();
            trans.move();   
            System.out.println("----------------------");
        }
    }
}
