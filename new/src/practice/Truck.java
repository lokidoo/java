package practice;

public class Truck extends Transport{

    protected  boolean isLoaded;

    public Engine engine = new Engine();


    public Truck(){}

    public Truck(int weight, byte[] coordinate){
        super(weight, coordinate);       
    }

    
    public Truck(int weight, byte[] coordinate, boolean isLoaded){
        super(weight, coordinate);
        this.isLoaded = isLoaded;      
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


    public void setValues(float speed, int weight, String color, byte[] coordinate, boolean isLoaded){
        super.setValues(speed, weight, color, coordinate);
        this.isLoaded = isLoaded;
    }

    @Override
    protected String getValues(){
        System.out.println(super.getValues()); 
        return getLoaded();
    }

    protected void setLoaded(boolean isLoaded){
            this.isLoaded = isLoaded;
    }
    
    protected String getLoaded(){
        if(isLoaded)
            return "Грузовик загружен.";
        else 
            return "Грузовик не загружен.";
    }

}
