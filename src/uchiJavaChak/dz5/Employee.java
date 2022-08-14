package uchiJavaChak.dz5;

public class Employee {
    Employee (int nomer, String familia, int let, double zp, String otdel){
       nomer = id;
       familia = surename;
       let = age;
       zp = salary;
       otdel = department;
        //выше создал конструктор в котором прописал параметры
   }
    int id;
    int age;
    String surename;
    String department;
    double salary;

    //double uvelzp (double salary) { //на этот метод не обращай пока внимание
    //double res = salary + salary;
    //return res;
    }
//}

class  EmployeeTest {
    public static void main(String[] args) {//создаю переменные а1. а2, а3 прописываю чо выводить в их конструкторе
        Employee a1 = new Employee(1,"Lobov",34,33000.50,"снабжения");
        Employee a2 = new Employee(2,"Goof",31,77000.00,"снабжения");
        Employee a3 = new Employee(3,"Ivanov",21,15600.00,"технический");


// а выводит дефолтные значения переменных как будто бы не видит параметры в конструкторе
        //не могу понять почему так происходит
        System.out.println(a1.id);
        System.out.println(a1.age);
    }
}
