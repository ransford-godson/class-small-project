//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");
        int angle = 30;

        System.out.printf("Sin(30): %.2f\n ",Math.sin(Math.toRadians(angle)));
        System.out.printf("Cos(30): %.2f\n ", Math.cos(Math.toRadians(angle)));
        System.out.printf("Tan(30): %.2f\n" ,Math.tan(Math.toRadians(angle)));
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}