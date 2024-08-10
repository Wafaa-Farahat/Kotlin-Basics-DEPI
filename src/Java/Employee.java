package Java;

//using constructor chaining
public class Employee {
    //instance fields (used /belong to every instance)
    int emp_id;
    String ename;
    double salary;
    double bonus;
    String department;
    boolean resident;

//    public Employee(){}
    public Employee(){
        emp_id=100;
        ename="mohamed";
        salary=8000;
        bonus=700;
        department="not assigned yet";
        resident=true;

    }
    public Employee(int id , String n ){
        ename =n;
        emp_id = id;
    }
    public Employee(int empid , String na, boolean r){
        //emp_id = empid;
        //name=na;
        //calling pre constructor
        this(empid,na);
        resident=r;
    }
    public Employee(int empid , String na, double s, double b , String d , boolean r){

        this(empid,na,r);
        salary=s;
        bonus=b;
        department=d;
    }

    public void set_salary(double s){
        salary=s;
    }
    public void set_salary(double s,double b){
        //this is method, so we can't use this direct like constructor
        // this(s);
        this.set_salary(s);
        bonus=b;
    }

    public void printEmpData(){
        System.out.println("Emp ID" +" "+emp_id);
        System.out.println("Name" +" "+ ename);
        System.out.println("Salary" +" "+salary);
        System.out.println("Bonus" +" "+ bonus);
        System.out.println("Department" +" "+ department);
        System.out.println("Resident" +" "+resident);

    }

}