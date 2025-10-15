package Problem7;

public class Carpenter implements Person{
    String name;
    public Carpenter(String name){
        this.name = name;
    }
    @Override
    public void display(){
        System.out.println("I am "+name+" the Carpenter");
    }
}
