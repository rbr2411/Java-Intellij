package Factory;

public class GetPlanFactory {
    public Plan getPlan(String planType){
        if (planType == null)
            return null;
        else if(planType.equalsIgnoreCase("Domestic"))
            return new Domestic();
        else if(planType.equalsIgnoreCase("Commercial"))
            return new Commercial();
        else if(planType.equalsIgnoreCase("International"))
            return new International();
        else return null;
    }
}
