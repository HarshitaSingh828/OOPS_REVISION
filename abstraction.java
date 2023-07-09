//1. any cls which extends parent cls having abstact method toh that cls must define the methods of abstract cls.
//2. in a cls if we have abstract method then cls should made to abstract.
//3. abstract methods which dont have body only declaration.
//4. not necessary if a cls is abstract toh method can or cannot be abstract.
//5. wont create objects in abstraction as we dont have the body of abstract method we cant call them.

public class abstraction {
  public static void main (String[]args){

    car c = new car();
    c.show();
    scooter s = new scooter();
    s.show();
  }
}

abstract class Vehicle{
   abstract void show();
}
class car extends Vehicle{
   void show(){
    System.out.println("car");
   }
}
class scooter extends Vehicle{
     void show(){
    System.out.println("scooter");
   }
}