public class Line {
    static double a = 3,b = 2,c = -4;
    public static void calculate(double a, double b, double c){
        double xIntercept, yIntercept, slope, distanceToOrigin;
        xIntercept = -(c/a);
        yIntercept = -(c/b);
        slope = yIntercept/(0-xIntercept);
        distanceToOrigin = Math.abs(c) / Math.sqrt(a*a+b*b);
        System.out.println("The X intercept is: " + xIntercept);
        System.out.println("The Y intercept is: " + yIntercept);
        System.out.println("The slope is: " + slope);
        System.out.println("The closest distance to the origin is: " + distanceToOrigin);
    }
    public static void main(String[] args){
        calculate(a,b,c);
    }
}
