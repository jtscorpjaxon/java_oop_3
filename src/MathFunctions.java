public class MathFunctions {
    static double exp;
    static double pi;

    static {
        exp = 2.71828182846;
        pi = 3.14159265359;
    }

    //Doiranning yuzi hisoblash
    static double circleArea(double radius) {
        return pi * radius * radius;
    }

    //e^a hisoblash
    static double expFunction(double a) {
        return Math.pow(exp, a);
    }

    //Geron formulasi yordamida uchburchak yuzini hisoblash
    static double triangleArea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
