import java.util.Arrays;

public class Employee {
    private String fullName;
    // private int [] department = {1, 2, 3, 4, 5};
    private int department;
    private int salary;



    private static int counter;
    private int id;

    public String getFullName() {
        return this.fullName;
    }


    public int getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }

    /*   public void setFullName(String fullName) {
          this.fullName = fullName;
       }*/
    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        id = counter;
        counter++;
    }

    public String toString() {
        return "ФИО " + fullName + " отдел " + department + " зарплата " + salary + " id " + id;
    }

    public static String toStringEmploee(Employee[] employees) {
        return Arrays.toString(employees);
    }

    public static int sum(Employee[] employees) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        return sum;
    }

    public static Employee max(Employee[] employees) {
        Employee employee = employees[0];
        int maxSum = employees[0].getSalary();
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSum) {
                maxSum = employees[i].getSalary();
                employee = employees[i];
            }
        }
        return employee;
    }


   public static Employee min (Employee[] employees) {
        Employee employee = employees[0];
       int minSum = employees[0].getSalary();
       for (int i = 1; i < employees.length; i++) {
           if (employees[i].getSalary() < minSum) {
               minSum = employees[i].getSalary();
               employee = employees[i];
           }
       }
       return employee;
   }
   public static int average (Employee[] employees) {
        int average = sum(employees) / employees.length;
       return average;
   }
   public static void printNames (Employee[] employees){
       System.out.println("Все ФИО сотрудников : ");
        for (int i = 0; i< employees.length; i++){

            System.out.println(employees[i].getFullName());
        }
   }

}