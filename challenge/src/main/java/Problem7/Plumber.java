package Problem7;

public class Plumber implements Person {
    String name;
    public Plumber(String name){
        this.name = name;
    }
    @Override
    public void display(){
        System.out.println("I am "+name+" the Plumber");
    }
}
