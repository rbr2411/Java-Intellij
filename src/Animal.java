public class Animal {
    private String name;
    private int age;
    private int id;
    public void setName(String name){
        this.name = name+ " Champion";
    }
    public void getName(){
        System.out.println(this.name);
    }
}
class Tortoise extends Animal{
    private int speed;
}
class Trial {
    public static void main(String[] args) {
        Tortoise tortoise = new Tortoise();
        tortoise.setName("Ravi");
        tortoise.getName();
    }
}