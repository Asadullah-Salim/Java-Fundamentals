public class ReturnTypes {
    public static double calculateMealPrice(double listedMealPrice,
                                          double tipRate,
                                          double taxRate){
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tax + tip;
        return result;

    }
    public static void main(String[] args) {
       double groupTotalMealPrice = calculateMealPrice(15,.2,0.08);
       System.out.println(groupTotalMealPrice);

       double individualMealPrice = groupTotalMealPrice/5;
       System.out.println(individualMealPrice);
    }
}
