public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome To EmployeeWageComputationProgram");
        int IS_PART_TIME=1;
        int IS_FULL_TIME=2;
        int EMP_RATE_PER_HOUR=20;
        int empHrs;
        int empWage;
        double empCheck=Math.floor(Math.random()*10)%2;
        if(empCheck==IS_PART_TIME){
            System.out.println("Employee IS Present");
            empHrs=4;
        }
        else if (empCheck==IS_FULL_TIME) {
            System.out.println("Employee IS Present");
            empHrs=8;
        }

        else {
            System.out.println("Employee IS Absent");
            empHrs = 0;
        }
        empWage=empHrs*EMP_RATE_PER_HOUR;
        System.out.println("Emp Wage:"+empWage);
    }
}
