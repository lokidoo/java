public class Boat extends Vehicle{

    public Boat(double speed, String color){
        super(speed, color);
    }

    @Override
    public void move(){
        System.out.println("Лодка плывет. Вот так сюрприз..");
    }

}
