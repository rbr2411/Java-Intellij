package DecoratorBev;

public abstract class Beverage {
    protected String description = "Unknown Beverage";
    public String getDescription(){
        return description;
    }
    public abstract double cost();
}

abstract class CondimentDecorator extends Beverage{
    public abstract String getDescription();
}

class Espresso extends Beverage{
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1;
    }
}

class HouseBlend extends Beverage{
    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 2;
    }
}

class Decat extends Beverage{
    public Decat() {
        description ="Decat";
    }

    @Override
    public double cost() {
        return 3;
    }
}

class DarkRoast extends Beverage{
    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 4;
    }
}

class Mocha extends CondimentDecorator{
    Beverage beverage;
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription()+" Mocha";
    }

    public double cost(){
        return beverage.cost()+ 0.20;
    }
}
class Main{
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()+ "  $"+beverage.cost());
        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.getDescription()+" $"+beverage1.cost());


    }
}
