public class EmployeeSalaryCalculator {
    public static double employeeSalary(double hoursPerWeek, double amountPerHour){
      double weeklyPaycheck = hoursPerWeek * amountPerHour;
      return weeklyPaycheck * 52;
    }
    public static void main(String[] args) {
        double salary = employeeSalary(40,15);
        System.out.println(salary);
    }
}
