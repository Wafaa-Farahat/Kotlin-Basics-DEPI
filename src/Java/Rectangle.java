package Java;

public class Rectangle {
    private  double length;
    private double width;
   private static  int no_of_objects;

//    public  Rectangle(){
//        no_of_instances ++;
//    }

    public  Rectangle(){

        length=15;
        width=10;
        no_of_objects ++;
//        System.out.println("default constructor");
    }

    public Rectangle(double l , double w){
        length=l;
        width=w;
        no_of_objects ++;

    }

    public  void modifyObject(Rectangle r){
        r.length=67;
        r.width=98;
    }

    public Rectangle add(Rectangle r2){
     Rectangle result=new Rectangle();
     result.length=this.length+r2.length;
     result.width=this.length+ r2.width;
     return result;
    }
   public static int get_objects_no(){
        return no_of_objects;
    }

    public  void setLength(double l){
        l=70;
        length=l;
    }
    public  void setWidth(double w){
        width=w;
    }

    public double getLength(){
        return  length;
    }
    public double getWidth(){
        return width;
    }

    public double getArea(){
        return width*length;
    }
}
