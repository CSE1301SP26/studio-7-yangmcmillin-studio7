public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double initLength, double initWidth){
        length=initLength;
        width=initWidth;
    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    public void setLength(double newLength){
        length=newLength;
    }
    public void setWidth(double newWidth){
        width=newWidth;
    }
    
    public double Area() {
        double area = length * width;
        return area;

    }
    public double Perimeter(){
        double perimeter = (2 * length) + (2 * width);
        return perimeter;
    
    }
    public boolean isSquare(){
        return length==width;
    }
    public boolean compareSize(Rectangle other){
        return (length*width)<other.Area();
    
    }
    public String toString(){
    return "length: "+length + " width: " + width;

    }
public static void main(String[] args){
    Rectangle other =new Rectangle(3,2);
    Rectangle r1 = new Rectangle(4, 12);
    Rectangle r2= new Rectangle(3,1);
    System.out.println(r1.toString());
    System.out.println(r1.Area());
    System.out.println(r1.Perimeter());
    System.out.println(r1.isSquare());
    System.out.println(r1.compareSize(other));
    System.out.println(r2.compareSize(other));
    





}}
