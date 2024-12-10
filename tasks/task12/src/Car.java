public class Car extends Vehicle{

    private String name;

    public Car(double speed, String color, String name){
        super(speed, color);
        this.name = name;
    }

    @Override
    public void move(){
        System.out.println( "Машина " + name + " едет...");            
    }

}
