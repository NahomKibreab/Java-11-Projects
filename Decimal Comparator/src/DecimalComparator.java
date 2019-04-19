public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double x, double y){
        int paramOne = (int) (x * 1000);
        int paramTwo = (int) (y * 1000);
        if (paramOne == paramTwo){
            return true;
        } else return false;
    }
}
