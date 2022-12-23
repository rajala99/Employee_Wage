public class Employee_wage {
    public static void main(String[] args) {
        System.out.println(" Welcome to Employee wage computation program ");
        final int Wage_per_hours = 20;
        final int part_time_hours = 4;
        final int fullday_hours = 8;
        int pay = 0;
        int employee = (int) Math.floor(Math.random() * 10) % 3;
        switch (employee) {
            case 1:
                System.out.println(" Employee is full time");
                pay = Wage_per_hours * fullday_hours;
                break;
            case 2:
                System.out.println(" Employee is part time");
                pay = Wage_per_hours * part_time_hours;
                break;
            default:
                System.out.println("Employee is absent");
        }
        System.out.println("Employee daily wage is :" + pay);
    }
}
