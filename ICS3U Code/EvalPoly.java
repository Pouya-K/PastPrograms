public class EvalPoly {
    static int[] arr = {7,0,5,-2};
    static double userX = 4.0;
    public static double evalPoly(int[] poly, double x){
        double funcX = 0;
        for(int i = 0; i<poly.length; i++){
            funcX += poly[i]*Math.pow(x,i);
        }
        return funcX;
    }
    public static void main(String[] args){
        System.out.println("The evaluated polynomial is: "+evalPoly(arr, userX));
    }
}
