public class Rectangle {

    private float width;
    private float hight;
    private static int count;

    public Rectangle(float width, float hight){
        this.width = width;
        this.hight = hight;
        count++;
        
        System.out.println("Прямоугольник №" + count);
        System.out.print("Площадь: " + getArea() + ", ");
        System.out.println("периметр: " + getPerimeter()+ "\n");
    }

    public float getArea(){

        float res = this.width * this.hight;
        return res;

    }

    public float getPerimeter(){

        float res = (this.width + this.hight) * 2;
        return res;

    }


    

}
