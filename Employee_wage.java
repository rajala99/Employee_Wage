public class Employee_wage {
    public static class Employee_Wage {
        int WAGE_PER_HR = 20;
        int WORKING_DAYS = 20;
        int max_emp_hr = 100;
        int emp_hr = 0;
        int dailyWage = 0;
        int totalEmpWage = 0;
        int total_emp_hr = 0;
        int total_working_days = 1;
        int empCheck = 0;
        public void TotalWage() {
            while (total_emp_hr <= max_emp_hr && total_working_days <= WORKING_DAYS) {
                empCheck = (int) (Math.floor((Math.random() * 10)) % 3);
                switch (empCheck) {
                    case 1:
                        emp_hr = 8;
                        break;
                    case 2:
                        emp_hr = 4;
                        break;
                    default:
                        emp_hr = 0;
                }
                total_emp_hr = total_emp_hr + emp_hr;
                System.out.println("Total days " + total_working_days
                        + " Total working hrs " + total_emp_hr);
                total_working_days++;
            }
            totalEmpWage = total_emp_hr * WAGE_PER_HR;
            System.out.println("Monthly wage is " + totalEmpWage);

        }
        public static <EmployeeWage> void main(String[] args) {
            Employee_Wage obj = new Employee_Wage();
            obj.TotalWage();
        }
    }
}
