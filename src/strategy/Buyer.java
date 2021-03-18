package strategy;

public class Buyer extends Role {

    private double limit;

    Buyer(double limit){
        this.limit = limit;
    }

    /**
     * The Buyer is happy if he can afford the product and the price is less than 200% over cost.
     */
    public boolean isSatisfied(Product prod, double price) {
        if(price < limit && price < prod.getCost() * 2){
            return true;
        }else{
            return false;
        }
    }

}
