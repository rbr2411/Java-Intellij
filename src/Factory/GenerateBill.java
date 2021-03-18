package Factory;

import java.util.Scanner;

public class GenerateBill {
    public static void main(String[] args) {
        GetPlanFactory planFactory = new GetPlanFactory();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter plan Name:");
        String planType = scanner.nextLine();
        int units = scanner.nextInt();
        Plan p = planFactory.getPlan(planType);
        System.out.println("Bill amount for "+planType+" of "+units+" is:");
        p.getRate();
        p.calculateBill(units);
    }
}
