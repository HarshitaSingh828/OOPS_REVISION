// final keyword can be used with a variable, method and with a class.
// varible value cant be updated, method cant be override and class cant be inherit.


//eg value of pi is const.
// public class finalKeyword {
//    public static void main(String[]args){
//      int i = 10;
//      i = i+20;
//      System.out.println(i);
//    }
// }


// public class finalKeyword {
//    public static void main(String[]args){
//     final int i = 10;
//      i = i+20;
//      System.out.println(i);
//    }
// }

//method cant be override

// class Demo{
//   final void m1(){
//       System.out.println("I am in demo class");
//    }
// }
// class Test extends Demo{
//    void m1(){
//       System.out.println("I am in Test class");
//    }
// }public class finalKeyword {
//    public static void main(String[]args){
//     Test t = new Test();
//     t.m1();
//    }
// }

//class cant be inherited 
final class Demo{
   void m1(){
      System.out.println("I am in demo class");
   }
}
class Test extends Demo{
   void m1(){
      System.out.println("I am in Test class");
   }
}public class finalKeyword {
   public static void main(String[]args){
    Test t = new Test();
    t.m1();
   }
}

