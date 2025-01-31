public class MaintenanceCosts {
    public static void main(String[] args)
    {
        int springMaintenance = 1000;
        int summerMaintenance = 1500;
        int fallMaintenance = 1200;
        int winterMaintenance = 2500;
        int yearlyMaintenance = 0;

        yearlyMaintenance = springMaintenance + summerMaintenance + fallMaintenance + winterMaintenance;

        System.out.println("Your spring maintenance costs are " + springMaintenance + ".");
        System.out.println("Your summer maintenance costs are " + summerMaintenance + ".");
        System.out.println("Your fall maintenance costs are " + fallMaintenance + ".");
        System.out.println("Your winter maintenance costs are " + winterMaintenance + ".");
        System.out.println("Your total annual maintenance cost is " + yearlyMaintenance + ".");

    }
}