// access modifier includes - private, public, protected, default
// non-access modifier includes - static, final, abstract, sychronized and scriptfp
// static keyword is a non access modifier


// class test{
//   void m1(){
//    static  int a = 10;
//     System.out.println("hello");
//   }
// }
// public class statickeyword {
  
//   public static void main(String[]args){
//      test t = new test();
//   }
// }

// class Test{
//   static int a = 10;  // if this is a normal variable then we need to create an object first and then call.
//   // but here the variable is static so we can access a by class 
// }
//  public class statickeyword {
//   public static void main(String[]args){
//      System.out.println(Test.a);
//   }
// }

// class Employee{
//     int empid;
//     String name;
//     String company;

//     Employee(){
//     }

//     Employee(int empid, String name, String company){
//         this.empid = empid;
//         this.name = name;
//         this.company = company;
//     } 
//     void display(){
//       System.out.println(empid + " "+ name +" "+company);
//     }
// }

// public class statickeyword {
//     public static void main(String[]args){
//         Employee e1 = new Employee(101,"Harshita","ABC");
//          e1.display();
//           Employee e2 = new Employee(103,"HarshitaSingh","ABC");
//          e2.display();
//     }
// }

// class Employee{
//     int empid;
//     String name;
//    static  String company = "ABC";

//     Employee(){
//     }

//     Employee(int empid, String name){
//         this.empid = empid;
//         this.name = name;
       
//     } 
//     void display(){
//       System.out.println(empid + " "+ name +" "+company);
//     }
// }

// public class statickeyword {
//     public static void main(String[]args){
//         Employee e1 = new Employee(101,"Harshita");
//          e1.display();
//           Employee e2 = new Employee(103,"HarshitaSingh");
//          e2.display();
//     }
// }


// public class statickeyword {
//    static int count = 0;
//    statickeyword(){
//     count++;
//     System.out.println(count);
//    }
//     public static void main(String[]args){
//         statickeyword s1 = new statickeyword();
//         statickeyword s2 = new statickeyword();
//     }
// }

//static method belongs to class not object can be called with class name

// class test{
//   static void display(){
//     System.out.println("hello");
//   }
// }
// public class statickeyword {
//     public static void main(String[]args){
        
//         test.display();
//     }
// }

// uses of statickeyword: 3. A static method can only access static variables.
// class X{
  
//       static  int  i  = 10;
//       static void display(){
//        System.out.println(i);
//       }
  
// }
// public class statickeyword {
  
//   public static void main(String[]args){
        
//       X x = new X();
//       x.display();
//     }
// }

// 4. A static method can only access static mrthods.

// class X{
  
//       static  int  i  = 10;
//       static void display(){
//         show();
//        System.out.println(i);
//       }
//       void show(){

//       }
// }
// public class statickeyword {
  
//   public static void main(String[]args){
        
//       X x = new X();
//       x.display();
//     }
// }

//5. static method cannot refers this or super keyword in anyway.

// class X{
  
//   int i = 10;

//    static void display(){
//     System.out.println(this.i);
//    }

// }
// public class statickeyword {
  
//   public static void main(String[]args){
        
//       X x = new X();
//       x.display();
//     }
// }


//---------------------------------static block-------------------
//before java version of 1.6 we can directly print it but after that we need to create main method.
//static block will run first and automatically when the class is loaded into the mainmemory.
public class statickeyword {
 
  static{
    System.out.println("hello");
  }

  static{  // can have multiple static methods
    System.out.println("hello00000000000000000");
  }
 public static void main(String[]args){
  System.out.println("nnnnnnn");
 }
}

// uses of static blocks: 1. used to load native methods and use to intialise static variables.