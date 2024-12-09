package practice;

public class Car extends Transport implements ILights{

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

    //ILighst interface

    private boolean isOn = false;

    @Override
    public void setLight(boolean set) {
        isOn = set;
    }

    @Override
    public void blinkLight() {
        System.out.println("Фары моргнули! ");
    }
    
}
