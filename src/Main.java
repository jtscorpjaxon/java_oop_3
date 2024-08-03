//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double circleRadius = 40;
        System.out.println("Doira radiusi: " + circleRadius);
        System.out.println("Doira yuzi: " + MathFunctions.circleArea(circleRadius));

        System.out.println("Uchburchak a=3 b=4 c=5 yuzi:"+MathFunctions.triangleArea(3, 4, 5));

        System.out.println("a=5 e^a = "+MathFunctions.expFunction(5));
    }
}
