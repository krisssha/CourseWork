public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
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

        System.out.println(Employee.toStringEmploee(employees));
        System.out.println("Сумма затрат на зарплаты в месяц = " + Employee.sum(employees));
        System.out.println("Сотрудник с максимальной зарплатой : " + Employee.max(employees));
        System.out.println("Сотрудник с минимальной зарплатой : " + Employee.min(employees));
        System.out.println("Среднее значение зарплат :  " + Employee.average(employees));
        Employee.printNames(employees);


        String s1 = new String("Кристина");
        String s2 = new String("Кристина");
        s1.equals(s2);
        Employee.salaryPercentage(employees);

        Employee e1 = Employee.minSalary(employees, 1);
        System.out.println("Сотрудник 1 департамента с минимальной зарплатой : " + e1);

        Employee e2 = Employee.maxSalary(employees, 5);
        System.out.println("Сотрудник 5 департамента с максимальной зарплатой : " + e2);

        int e3 = Employee.sumSalary(employees, 3);
        System.out.println("Сумма зарплат на 3 департамент : " + e3);

        String e4 = Employee.workers(employees, 2);
        System.out.println("Сотрудники 2 департамента : " + e4);

        String arbitrary = Employee.arbitrary(employees, 50000);
        System.out.println("Список сотрудников с меньшей зарплатой : " + arbitrary);

        String arbitraryBig = Employee.arbitraryBig(employees, 50000);
        System.out.println("Список сотрудников с большей зарплатой : " + arbitraryBig);
    }

}