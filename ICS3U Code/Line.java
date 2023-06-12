public class Line {
    static double a = 3,b = 2,c = -4;
    public static void line(double a, double b, double c){
        /*
        Explanation: This program will take three different double values, a, b, c, which represent
                     the equation: aX + bY + c = 0, the equation of a line. We can find the X intercept,
                     Y intercept, slope, and the closest distance to the origin from that equation.
         */
        double xIntercept, yIntercept, slope, distanceToOrigin; //Variables which hold the answer values
        xIntercept = -(c/a); //Formula to calculate x intercept
        yIntercept = -(c/b); //Formula to calculate y intercept
        slope = yIntercept/(0-xIntercept); //Formula to calculate slope
        distanceToOrigin = Math.abs(c) / Math.sqrt(a*a+b*b); //Formula to calculate closest distance to origin
        //Output
        System.out.println("The X intercept is: " + xIntercept);
        System.out.println("The Y intercept is: " + yIntercept);
        System.out.println("The slope is: " + slope);
        System.out.println("The closest distance to the origin is: " + distanceToOrigin);
    }
    public static void main(String[] args){
        line(3, 2, -4);
    }
}