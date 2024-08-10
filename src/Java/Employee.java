package Java;

public class Employee_Constructor {
    public static void main(String[] args) {
        Employee_Constructor e0=new Employee_Constructor();
        e0.printEmpData();
        System.out.println("--------------");
        Employee_Constructor e1= new Employee_Constructor(1,"Ahmed");
        e1.printEmpData();
        System.out.println("--------------");
        Employee_Constructor e2= new Employee_Constructor(2,"Aya",true);
        e2.printEmpData();
    }

    int emp_id;
    String name;
    double salary;
    double bonus;
    String department;
    boolean resident;

    public Employee_Constructor(){}
    public Employee_Constructor(int id , String n ){
        name=n;
        emp_id = id;
    }
    public Employee_Constructor(int empid , String na, boolean r){
//        emp_id = empid;
//        name=na;
        this(empid,na);
        resident=r;
    }


    public void printEmpData(){
        System.out.println("Emp ID" +" "+emp_id);
        System.out.println("Name" +" "+name);
        System.out.println("Salary" +" "+salary);
        System.out.println("Bonus" +" "+ bonus);
        System.out.println("Department" +" "+ department);
        System.out.println("Resident" +" "+resident);

    }

}