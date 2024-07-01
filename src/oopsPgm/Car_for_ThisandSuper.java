package oopsPgm;

public class Car_for_ThisandSuper {
	
   int a=10;
   int b;
   String car_Name;
   double price;
   int speed;
   
   public void testSpeed(int speed)
   {
	   this.speed=speed;
	   System.out.println("Speed is "+speed);
   }
   
   public Car_for_ThisandSuper(int a,int b)
   {
	   this.a=a;
	   this.b=b;
	   System.out.println(a+" "+b);
   }
   
   public Car_for_ThisandSuper(String car_Name)
   {
	   this.car_Name=car_Name;
	   System.out.println(car_Name);
   }
   
   public Car_for_ThisandSuper(double price)
   {
	   this(10,15);
	   this.price=price;
	   System.out.println(price);
   }
   
   public Car_for_ThisandSuper()
   {
	   this("Volvo");
	   System.out.println("car details!!");
   }


}
