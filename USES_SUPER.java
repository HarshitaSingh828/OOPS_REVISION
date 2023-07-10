// 1. It is used to invoke parent class method
// class A{
//   void m1(){
//     System.out.println("i am in cls A");
//   }
// }
// class B extends A{
//   void show(){
//     super.m1();
//   }
// }
// public class USES_SUPER {
//   public static void main(String[]args){
//        B b = new B();
//        b.show();
//   }
// }
//2.  used to invoke immediate parent class constructor

class A{
   A(){
    System.out.println("i am in cls A");
   }
}
class B extends A{
    //by default it will call super 
   B(){
     System.out.println("i am in cls B");
   }
}

public class USES_SUPER {
  public static void main(String[]args){
       B b = new B();
  }
}