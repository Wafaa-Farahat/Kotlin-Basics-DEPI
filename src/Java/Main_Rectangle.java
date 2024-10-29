package Java;

public class Main_Rectangle {
    public static void main(String[] args) {
//        Rectangle r1= new Rectangle();
//        System.out.println(r1.getLength());
//        System.out.println(r1.getWidth());
//
//        Rectangle r2 = new Rectangle(23,26);
//        System.out.println(r2.getLength());
//        System.out.println(r2.getWidth());
//
//        System.out.println(Rectangle.no_of_objects);
//        System.out.println(Rectangle.get_objects_no());

//        Rectangle r1 = new Rectangle();
//
//        Rectangle r2 = new Rectangle();
//        Rectangle r3 = new Rectangle();
//        Rectangle r4 = new Rectangle();
//        Rectangle r5 = new Rectangle();
//
//        System.out.println(Rectangle.get_objects_no());


// using utility class
// System.out.println(Calc.multiply(5,10));

//        Rectangle room1=new Rectangle();
//        double roomlength= 50;
//        room1.setLength(roomlength);
//
//        System.out.println(room1.getLength());
//        System.out.println(roomlength);

//      Rectangle room3=new Rectangle();
//      //default values 10,15
//        System.out.println(room3.getLength());
//        System.out.println(room3.getWidth());
//
//      Rectangle myInputObject=new Rectangle(25,30);
//      // assigned values 25,30
//        System.out.println(myInputObject.getLength());
//        System.out.println(myInputObject.getWidth());
//
//
//        // pass by reference
//      room3.modifyObject(myInputObject);
//      // modify on inputObject -->default values 67,98 in method
//        System.out.println(myInputObject.getLength());
//        System.out.println(myInputObject.getWidth());
        
        Rectangle r1=new Rectangle(10,50);
        Rectangle r2=new Rectangle(30,70);
        System.out.println(r1.add(r2).getLength());
        System.out.println(r1.add(r2).getWidth());
    }

    }