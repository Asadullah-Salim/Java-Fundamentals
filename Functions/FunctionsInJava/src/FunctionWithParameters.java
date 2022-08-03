public class FunctionWithParameters {
    public static void calculateMealPrice(double listedMealPrice,
                                          double tipRate,
                                          double taxRate){
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tax + tip;
        System.out.println("Your Total Meal Price Is " + result);
    }
    public static void main(String[] args) {
        calculateMealPrice(15,.2,0.08);
    }
}
