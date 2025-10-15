package Problem6;

public class Circle implements Forme{
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double getSurface(){
        return Math.PI * radius * radius;
    }

}
