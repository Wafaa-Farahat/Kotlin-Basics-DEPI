package Java;

public class Main_Employee {
    public static void main(String[] args) {
//        Employee e0=new Employee();
//        e0.printEmpData();
//        System.out.println("--------------");
//        Employee e1= new Employee(1,"Ahmed");
//        e1.printEmpData();
//        System.out.println("--------------");
//        Employee e2= new Employee(2,"Aya",true);
//        e2.printEmpData();

        Employee e4= new Employee(300, "ali",5000,420,"Accounting",true);
        e4.printEmpData();
        System.out.println("--------------");

        e4.set_salary(7000,500);
        e4.printEmpData();
    }
}
