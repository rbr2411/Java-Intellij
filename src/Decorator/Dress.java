package Decorator;

public interface Dress {
    void assemble();
}

class BasicDress implements Dress{

    @Override
    public void assemble() {
        System.out.println("Adding Basic Features");
    }
}
class DecoratorDress implements Dress{
    protected Dress dress;
    public DecoratorDress(Dress c){
        this.dress = c;
    }
    @Override
    public void assemble() {
        this.dress.assemble();
    }
}
class FancyDress extends DecoratorDress{

    public FancyDress(Dress c) {
        super(c);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding Fancy Features");
    }
}

class CasualDress extends DecoratorDress{

    public CasualDress(Dress c) {
        super(c);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding Casual Features");
    }
}

class SportyDress extends DecoratorDress{

    public SportyDress(Dress c) {
        super(c);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding Sporty Features");
    }
}

//Client Class
class DecoratorPatternTest{
    public static void main(String[] args) {
        Dress sportyDress = new SportyDress(new BasicDress());
        sportyDress.assemble();
        System.out.println();

        Dress fancy = new FancyDress(new BasicDress());
        fancy.assemble();
        System.out.println();

        Dress sportFancy = new SportyDress(new FancyDress(new BasicDress()));
        sportFancy.assemble();
        System.out.println();

        Dress casualFancySport = new CasualDress(new SportyDress(new FancyDress(new BasicDress())));
        casualFancySport.assemble();
        System.out.println();
    }
}
