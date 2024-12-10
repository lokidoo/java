import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

         List<Shape> shapes = new ArrayList<>();

         shapes.add(new Circle(5));        
         shapes.add(new Rectangle(4, 7)); 
         shapes.add(new Circle(3));        
         shapes.add(new Rectangle(2, 2)); 

    }
}
