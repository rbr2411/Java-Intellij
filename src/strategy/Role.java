package strategy;

//algorithm- whether a deal is made or not
public abstract class Role {
    //what parameters should isSatisfied() method have?
    //whether a particular product is satisfied at a given price or not.
    public abstract boolean isSatisfied(Product prod, double price);
}
