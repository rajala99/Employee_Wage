public class Employee_wage {
    public static void main(String[] args) {
        System.out.println(" Welcome to Employee wage computation program ");
        final int Wage_per_hour = 20;
        final int fullday_hours = 8;
        double employee = Math.floor(Math.random() * 10) % 2;
        if (employee == 1) {
            System.out.println(" Employee is present ");
           int pay = Wage_per_hour * fullday_hours;
            System.out.println("Employee wage per day is : " + pay);
        } else {
            System.out.println(" Employee is absent ");
        }
    }
}
