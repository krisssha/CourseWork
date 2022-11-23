import java.util.Arrays;

public class Employee {
    private String fullName;
    // private int [] department = {1, 2, 3, 4, 5};
    int department;
    private int salary;

    public static Employee[] employees = new Employee[10];


    private static int counter;
    private int id;

    public String getFullName() {
        return this.fullName;
    }

    public int[] getDepartment() {
        return this.getDepartment();
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

    public static void main(String[] args) {
        employees[0] = new Employee("Иванов Иван Иванович", 1, 15000);
        employees[1] = new Employee("Борисов Евгений Петрович", 2, 19000);
        employees[2] = new Employee("Игнатьева Валентина Семеновна", 3, 18000);
        employees[3] = new Employee("Романова Александра Сергеевна", 4, 38000);
        employees[4] = new Employee("Доброгулова Людмила Викторовна", 5, 33000);
        employees[5] = new Employee("Антонова Татьяна Аркадьевна", 1, 50000);
        employees[6] = new Employee("Петрова Юлия Сергеевна", 2, 48000);
        employees[7] = new Employee("Чернов Юрий Юрьевич", 2, 90000);
        employees[8] = new Employee("Петров Юрий Александрович", 2, 92000);
        employees[9] = new Employee("Гончарова Анна Дмитриевна", 5, 170000);

        System.out.println(toStringEmploee(employees));
        System.out.println("Сумма затрат на зарплаты в месяц = " + sum(employees));
        System.out.println("Сотрудник с максимальной зарплатой : " + max(employees));
        System.out.println("Сотрудник с минимальной зарплатой : " + min(employees));
        System.out.println("Среднее значение зарплат :  " + average(employees));
        fio(employees);
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
        int average = sum(employees) / 10;
       return average;
   }
   public static void fio (Employee[] employees){
       System.out.println("Все ФИО сотрудников : ");
        for (int i = 0; i< employees.length; i++){

            System.out.println(employees[i].getFullName());
        }
   }

}