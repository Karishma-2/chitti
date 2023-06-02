package methodpackage;

public class Rectangle {
 int l,b;
 public Rectangle()
 {
	 System.out.println("Im Constructor without parameter");
	 l=10;
	 b=20;
 }
  public Rectangle(int l,int b)
  {
	  System.out.println("Im Constructor with parameter");
	  this.l=l;
	  this.b=b;
  }
  public void area()
  {
	  System.out.println("Area of Rectangle :"+(l*b));
  }
	public static void main(String[] args) {
	Rectangle rec=new Rectangle(10,3);
	rec.area();

	}

}
