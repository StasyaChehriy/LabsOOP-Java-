public class Formula {

    public double calculate_formula(double a, double b, int n, int m){
        double result = 0;

        try {
            double S = 0;

            for (double i = a; i <= n; i++) {
                for (double j = b; j <= m; j++) {
                    double numerator = i + j;
                    double denominator = i - 2;

                    if (denominator == 0.0) {
                        System.out.println("Ділення на нуль!");
                        return Double.NaN;
                    }

                     result = result + (numerator / denominator);
//                     result += result;

                }
            }

        } catch (Exception e){
            System.out.println("Помилка: " + e);
        }
        return result;
    }
}
