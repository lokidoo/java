public class Circle extends Shape{

    private double radius; 

    public Circle (double radius){
        
        this.radius = radius;        

        System.out.println("Фигура: круг");
        System.out.println("S = " + getArea() + " см");
        System.out.println("P = " + getPerimeter() + " см\n");
    }

   

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString(){
        return "Круг, радиус: " + this.radius;
    }
}
