// // 2. can be used to invoke current cls method.
// class Test{
//   void display(){
//     System.out.println("Hello");
//   }
//   void show(){
//     this.display(); // either u write display() by defualt compiler adds or else u add manully both wil give sme o/p.
//   }
// }
// public class USES_THIS {
//   public static void main(String[]args){
//     Test  t = new Test();
//     t.show();
//   }
// }

//3. can be used to invoke current class constructor
// class TestDemo{
//      TestDemo(){
//       System.out.println("default");
//      }
//      TestDemo(int a){
//      System.out.println("parameterised");
//      }

// }

// public class USES_THIS {
//   public static void main(String[]args){
//     TestDemo  t= new TestDemo();
//     TestDemo tu= new TestDemo(1);
//   }
// }


// class TestDemo{
//      TestDemo(){
//       System.out.println("default");
//      }
//      TestDemo(int a){
//       this();
//      System.out.println("parameterised");
//      }

// }

// public class USES_THIS {
//   public static void main(String[]args){
//     TestDemo tu= new TestDemo(1);
//   }
// }

// class TestDemo{
//      TestDemo(){
//        this(10);
//        System.out.println("default");
//      }
//      TestDemo(int a){
//      System.out.println("parameterised");
//      }

// }

// public class USES_THIS {
//   public static void main(String[]args){
//     TestDemo t = new TestDemo();
//   }
// }

//4. used to pass as an argument in a method call.

// class TestDemo{
//   void display(TestDemo t){
//   System.out.println("hiiiiiiiiiiiiiiii");
//   }
//   void show(){
//     display(this);
//   }
// }
// public class USES_THIS {
//   public static void main(String[]args){
//     TestDemo t = new TestDemo();
//     t.show();
//   }
// }

// 5. used to pass as as argument in a constructor call

// class Test{
//   Test(USES_THIS u){
//      System.out.println("helloooooooo");
//   }
// }
// public class USES_THIS {
//   void m1(){
//      Test t = new Test(this);
//   }
//   public static void main(String[]args){
//    USES_THIS u = new USES_THIS();
//    u.m1();
//   }
// }


//6. this keyword can be used to return current class instance
class ThisDemo{
  ThisDemo m1(){
    return this;
  } 
}
public class USES_THIS {
  public static void main(String[]args){
    ThisDemo t = new ThisDemo();
    t.m1();
  }
}