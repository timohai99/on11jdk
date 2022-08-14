package uchiJavaChak.dz5;

public class Employee {
    Employee (int nomer, String familia, int let, double zp, String otdel){
       nomer = id;
       familia = surename;
       let = age;
       zp = salary;
       otdel = department;
   }
    int id;
    int age;
    String surename;
    String department;
    double salary;

    double uvelzp (double salary) {
    double res = salary + salary;
    return res;
    }
}

class  EmployeeTest {
    public static void main(String[] args) {
        Employee a1 = new Employee(1,"Lobov",34,33000.50,"снабжения");
        Employee a2 = new Employee(2,"Goof",31,77000.00,"снабжения");
        Employee a3 = new Employee(3,"Ivanov",21,15600.00,"технический");



        System.out.println(a1.age);
        System.out.println(a2.age);
    }
}
