package practice;

public class Car extends Transport {

    public Engine engine = new Engine();

    public Car(){}

    public Car(float speed, int weight, String color, byte[] coordinate){
        super(speed, weight, color, coordinate);
    }

    @Override
    public void moveObject(float speed){
        System.out.println("Транспорт движется со скоростью " + speed);
    }

    
    @Override
    public boolean stopObject(){
        this.speed = 0;
        return true;
    }
    
}
