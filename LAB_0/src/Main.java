import java.util.Scanner;

public class Main {
     static void main (String [] args){
        VariantCalculate obj1 = new VariantCalculate();
        obj1.calculation_var();
        Scanner scanObj = new Scanner(System.in);
        System.out.println("Введіть a, b, n, m: ");
        double a = scanObj.nextDouble();
        double b = scanObj.nextDouble();
        int n = scanObj.nextInt();
        int m = scanObj.nextInt();
        Formula obj2 = new Formula ();
        System.out.println("Результат суми: " + obj2.calculate_formula(a, b, n, m));
    }
}
