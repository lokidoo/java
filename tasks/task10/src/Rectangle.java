public class Rectangle extends Shape {

    private double width;
    private double hight;

    public Rectangle (double width, double hight){
       
        this.width = width;
        this.hight = hight;

        System.out.println("Фигура: прямоугольник");
        System.out.println("Площадь прямоугольника = " + getArea() + " см");
        System.out.println("Периметр прямоугольника = " + getPerimeter() + " см\n");
    }

    @Override
    public double getArea() {
        return width * hight;
    }

    @Override
    public double getPerimeter() {
        return (width + hight) * 2;
    }

}
