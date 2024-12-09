package practice;
public abstract class Transport {
    
    // переменные/поля:

    protected   float speed;
    private int weight;
    private   String color;
    private byte[] coordinate;

    //конструкторы:

    public Transport() {}

    public Transport(float speed, int weight, String color, byte[] coordinate){

        setValues(speed, weight, color, coordinate);
      
    }

    public Transport(int weight, byte[] coordinate){

        this.weight = weight;
        this.coordinate = coordinate;
        
    }
    
    //абстрактные методы:

    public abstract void moveObject(float speed);
    public abstract boolean stopObject();

    //общие методы:

    protected  void setValues(float speed, int weight, String color, byte[] coordinate){

        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinate = coordinate;
        
    }
    
    protected  String getValues(){
        String info = "Object speed: " + speed + ". Weight: " +  weight + ". Color: " + color + "\n";
        String infoCoordinates = "Coordinates: ";

        for (int i = 0; i < coordinate.length; i++)
            infoCoordinates += coordinate[i] + " ";
        
        return info + infoCoordinates + "\n"; 
    }
    
    //класс "двигатель":

    class Engine{

        private boolean isReady;
        private int km;

        public void setValues(boolean isReady, int km){
            this.isReady = isReady;
            this.km = km;
        }

        public void isReady(boolean isReady){
            this.isReady = isReady;
        }
        
        public void info(){
            if(isReady)
                System.out.println("Двигатель исправен. Пробег: " + km + " км");
            else
                System.out.println("Двигатель неисправен. Пробег: " + km + " км");
        }
    }
}
