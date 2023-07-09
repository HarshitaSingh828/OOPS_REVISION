//interface contains only abstract methods
//it is a blueprint that tells what to do not how to do 
// use: to achieve abstraction, loose coupling , supports multiple inheritance
//cannot create its object
// syntax 
// interface interfacename{
//   methods  all methods is abstract by defualt complier make it public abstract
//   fields  by defualt public static final int a = 10;
// we can also create concrete method after java version of 8 like
// default void show(){}
// static void show(){}
//in java version 9 private void show(){}
// }

// interface I1{
//   public abstract void show();
//   public static final int a= 10;
//   private void display(){

//   }
// }

// interface I1{
//   void show();
// }
// class Test implements I1{
//   public void show(){
//       System.out.println(1);
//   }
// }
// public class interface_java {
//   public static void main(String[]args){
//   // I1 n = new I1();
//   // n.show();
//     Test t = new Test();
//      t.show();
//   } 
// }

//it supports multiple inheritance

interface I1{
  void show();
}
interface I2{
  void display();
}
class Test implements I1,I2{
  public void show(){
      System.out.println(1);
  }
  public void display(){
     System.out.println(2);
  }
}
public class interface_java {
  public static void main(String[]args){
  // I1 n = new I1();
  // n.show();
    Test t = new Test();
     t.show();
     t.display();
  } 
}