package strategy;

public class Seller extends Role {

    /**
     * Seller will be happy if they make 20% profit on whatever they sell.
     */
    public boolean isSatisfied(Product prod, double price) {
        if(price - prod.getCost() > prod.getCost() * 0.2){
            return true;
        }else{
            return false;
        }
    }

}
