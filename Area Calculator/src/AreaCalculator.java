public class AreaCalculator {
    public static double area(double radius){
        if (radius < 0){
            return -1d;
        }
        return 3.14159 * (radius * radius);
    }

    public static double area(double x,double y){
        if (x < 0 || y < 0){
            return -1d;
        }
        return x * y;
    }
}
