package jd_07;

public class Employee {
        public String name;
        public int age;
        public char gender;
        public String jobTitle;
        public Double salary;

        public void work(){
                System.out.println(jobTitle + name + " is working.");
        }

        public String toString() {
                return "Employee{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        ", gender=" + gender +
                        ", jobTitle='" + jobTitle + '\'' +
                        ", salary=" + salary +
                        '}';
        }


}

