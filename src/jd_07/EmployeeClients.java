package jd_07;

public class EmployeeClients {

    public static void main(String[] args) {

        Employee employee1 = new Employee();

        employee1.name = "Ridwan";
        employee1.age = 20;
        employee1.gender = 'M';
        employee1.jobTitle = "SDET";
        employee1.salary = 100_000.0;

        System.out.println(employee1.toString());

        Employee employee2 = new Employee();
        employee2.name = "Yousif";
        employee2.age = 25;
        employee2.gender = 'M';
        employee2.jobTitle = "Product Owner";
        employee2.salary = 100_000.0;

        System.out.println(employee2.toString());

    }
}
