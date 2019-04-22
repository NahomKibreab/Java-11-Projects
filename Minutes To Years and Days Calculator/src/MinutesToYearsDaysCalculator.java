public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if (minutes < 0){
            System.out.println("Invalid Value");
        } else {
            double hours = minutes / 60;
            int years = (int) ((hours / 24) / 365);
            int days = (int) ((hours / 24) % 365);
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }

    }
}
