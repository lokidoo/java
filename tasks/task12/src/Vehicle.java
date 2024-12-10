public abstract class Vehicle {

    protected double speed;
    protected String color;

    public Vehicle(double speed, String color){
        this.speed = speed;
        this.color = color;
    }

    public abstract void move();

    public void displayInfo(){
        System.out.println("Цвет: " + color);
        System.out.println("Скорость: " + speed);
    }
    
}
