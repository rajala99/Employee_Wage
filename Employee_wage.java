public class Employee_wage {
    public static void main(String[] args) {
        System.out.println(" Welcome to Employee wage computation program ");
        int emp_Hrs;
        int emp_Wage_Per_Hrs = 20;
        int working_Days_Per_Month = 20;
        int maximumHrs_In_Month = 100;
        int total_EmployeeHrs = 0;
        int total_WorkingDays = 0;
        while (total_EmployeeHrs <= maximumHrs_In_Month &&
                total_WorkingDays < working_Days_Per_Month) {
            total_WorkingDays++;
            {
                int empCheck = (int) Math.floor(Math.random() * 10) % 3;
                switch (empCheck) {
                    case 1:
                        System.out.println("Employee is Present");
                        emp_Hrs = 8;
                        break;
                    case 2:
                        System.out.println("Employee is Part-Time Present");
                        emp_Hrs = 4;
                        break;
                    default:
                        System.out.println("Employee is Absent");
                        emp_Hrs = 0;
                }
                total_EmployeeHrs = emp_Hrs + total_EmployeeHrs;
                System.out.println("Day:" + total_WorkingDays + " EmpHour: " + emp_Hrs);
            }
            int totalEmployeeWage = total_EmployeeHrs * emp_Wage_Per_Hrs;
            System.out.println("Total Employee Wage " + totalEmployeeWage);
        }
    }
}
