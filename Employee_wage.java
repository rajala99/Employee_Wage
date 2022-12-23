public class Employee_wage {
    public static void main(String[] args) {
        System.out.println(" Welcome to Employee wage computation program ");
        int empHrs;
        int dailyWage;
        int daily_Wage;
        int monthly_Wage = 0;
        int emp_Wage_Per_Hrs = 20;
        int workingDaysPerMonth = 20;
        for (int day = 0; day < workingDaysPerMonth; day++) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case 1:
                    System.out.println("Employee is Present");
                    empHrs = 8;
                    break;
                case 2:
                    System.out.println("Employee is Part-Time Present");
                    empHrs = 4;
                    break;
                default:
                    System.out.println("Employee is Absent");
                    empHrs = 0;
            }
            dailyWage = empHrs * emp_Wage_Per_Hrs;
            monthly_Wage = dailyWage + monthly_Wage;
            System.out.println("Daily wage of employee is " + dailyWage);
        }
        System.out.println("-------------------");
        System.out.println("Monthly employee wage is " + monthly_Wage);
    }
}
