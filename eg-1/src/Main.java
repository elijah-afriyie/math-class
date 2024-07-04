public class Main {
    public static void main(String[] args) {
        double x = 3.14;
        double y = -100;
        double z = 19.98;

        // Maximum value
        double maxValue = Math.max(x, y);
        System.out.println("Maximum value is " + maxValue);
        
        // Minimum value
        double minValue = Math.min(x, y);
        System.out.println("Minimum value is " + minValue);
        
        // Absolute value
        double absY = Math.abs(y);
        System.out.println("Absolute value of " + y + " is " + absY);

        // Square root of value
        double sqrtAbsY = Math.sqrt(absY);
        System.out.println("Square root of " + absY + " is " + sqrtAbsY);

        // Round
        double round = Math.round(sqrtAbsY);
        System.out.println("Round of sqrtAbsY is " + round);

        // Round up
        double roundup = Math.floor(x);
        System.out.println("Round up of " + x + " is " + roundup);        
        
        // Round down
        double roundDown = Math.floor(z);
        System.out.println("Round down of " + z + " is " + roundDown);

        // Power
        double power = Math.pow(sqrtAbsY, 2);
        System.out.println("Power of sqrtAbsY is " + power);

        // Exponential
        double exp = Math.exp(sqrtAbsY);
        System.out.println("Exponential of sqrtAbsY is " + exp);

        // Logarithm
        double log = Math.log(sqrtAbsY);
        System.out.println("Logarithm of sqrtAbsY is " + log);
    }
}
