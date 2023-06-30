//gives ambiguity error
// class Test{
//   void show(){
//     System.out.println("1");
//   }
//   void show(){
//     System.out.println("2");
//   }
// }
// public class polymorphism {
//   public static void main(String[]args){
//     Test t= new Test();
    // t.show();
//   }
// }

// 1. diff. number of arg
// class Test{
//   void show(){
//     System.out.println(1);
//   }
//   void show(int a, int b){
//     System.out.println(2);
//   }
// }
// public class polymorphism {
//   public static void main(String[]args){
//     Test t= new Test();
//     // t.show(10,20);
//     t.show();
//   }
// }

//2. sequence of arg
// class Test{
//   void show(String a, int b){
//     System.out.println(1);
//   }
//   void show(int a, String b){
//     System.out.println(2);
//   }
// }
// public class polymorphism {
//   public static void main(String[]args){
//     Test t= new Test();
//     // t.show(10,"ssgdb");
//     t.show("abc",10);
//   }
// }

// 3. datatype of arguments
// class Test{
//   void show(int b){
//     System.out.println(1);
//   }
//   void show(String b){
//     System.out.println(2);
//   }
// }
// public class polymorphism {
//   public static void main(String[]args){
//     Test t= new Test();

//     t.show(10);
//   }
// }

// 1. can we achieve method overloading by changing the return type of a method in cls
// ans1. no we cant becoz of ambiguity error...
// class Test{
//   void show(int b){
//     System.out.println(1);
//   }
//   String show(int b){
//     System.out.println(2);
//   }
// }
// public class polymorphism {
//   public static void main(String[]args){
//     Test t= new Test();

//     t.show(10);
//   }
// }

// 2. can we overload main method
//  ans. yes we can coz JVM always looks for main method first..
// class Test{
//     public static void main(int a){
//         System.out.println("can overload");
//     }
// }
// public class polymorphism {
//   public static void main(String[]args){
//     Test t= new Test();

//     t.main(10);
//   }
// }

// Automatic promotion : if matching datatype wont found one datatype will be converted to another 
// class Test{
//     void show(int a){
//         System.out.println("int method");
//     }
//     void show(String a){
//         System.out.println("string method");
//     }
// }
// public class polymorphism{
//     public static void main(String[]args){
//         Test t = new Test();
//         t.show('a');
//     }
// }

//another example of automatic promotion....
// class Test{
//     void show(Object a){
//         System.out.println("int method");
//     }
//     void show(String a){
//         System.out.println("string method");
//     }
// }
// public class polymorphism{
//     public static void main(String[]args){
//         Test t = new Test();
//         t.show('a');
//     }
// }

//object cls is the parent cls of all the cls and gives preferences to the child cls method.
// class Test{
//     void show(Object a){
//         System.out.println("int method");
//     }
//     void show(String a){
//         System.out.println("string method");
//     }
// }
// public class polymorphism{
//     public static void main(String[]args){
//         Test t = new Test();
//         t.show("abc");
//     }
// }


// // both string and string builder comes into object class only...
// class Test{
//     void show(StringBuffer a){
//         System.out.println("stringbuffer method");
//     }
//     void show(String a){
//         System.out.println("string method");
//     }
// }
// public class polymorphism{
//     public static void main(String[]args){
//         Test t = new Test();
//         // t.show("abc");
//         // t.show(new StringBuffer("xyz"));
//         t.show(null);
//     }
// }


// class Test{
//     void show(int a, float b){
//         System.out.println("int float method");
//     }
//     void show(float a, int b){
//         System.out.println("float int method");
//     }
// }
// public class polymorphism{
//     public static void main(String[]args){
//         Test  t = new Test();
//         // t.show(10,20.5f);
//         // t.show(20.5f,10);
//         // t.show(10,20); // int but no conversion possible
//         // t.show("abc",20);  id datatypes are way more diff. so can be convert
//         // t.show(20.5f,20.5f); passing both floats so float can't be converted to int 
//      }
// }


//varargs.. it will acceppt 0 or multiple arguments.
class Test{
    void show(int a){
        System.out.println("int method");
    }
    void show(int... b){
        System.out.println("varargs method");
    }
}
public class polymorphism{
    public static void main (String[]args){
        Test t = new Test();
        // t.show();
        t.show(10,20,30);
    }
}