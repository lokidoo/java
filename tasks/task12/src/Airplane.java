public class Airplane extends Vehicle{

    public Airplane(double speed, String color){
        super(speed, color);
    }

    @Override
    public void move(){
        System.out.println("Ну конечно....он летит.");
    }

}
