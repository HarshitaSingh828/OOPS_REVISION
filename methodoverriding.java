//method overriding - number of arguments shld b sme
// class Test{
//     void show(){
//       System.out.println("Method overriding in Test cls");
//     }
// }
// class xyz extends Test{
//   void show(){
//     System.out.println("Method overriding in xyz cls");
//   }
// }
// public class methodoverriding {
//   public static void main(String[]args){
//        Test t = new Test();
//        t.show();
       
//        xyz x = new xyz();
//        x.show();
//   } 
// }


// number of arguments-- shld be same
// class Test{
//     void show(int a){
//       System.out.println("Method overriding in Test cls");
//     }
// }
// class xyz extends Test{
//   void show(int a){
//     System.out.println("Method overriding in xyz cls");
//   }
// }
// public class methodoverriding {
//   public static void main(String[]args){
//        Test t = new Test();
//        t.show(10);
       
//        xyz x = new xyz();
//        x.show(20);
//   } 
// }


// diff. sequence of arg..
// class Test{
//     void show(int a,String b){
//       System.out.println("Method overriding in Test cls");
//     }
// }
// class xyz extends Test{
//   void show(String a, int b){
//     System.out.println("Method overriding in xyz cls");
//   }
// }
// public class methodoverriding {
//   public static void main(String[]args){
//        Test t = new Test();
//        t.show(10,"abc");
       
//        xyz x = new xyz();
//        x.show("abc",20);
//   } 
// }

//same seq. of args
// class Test{
//     void show(int a,String b){
//       System.out.println("Method overriding in Test cls");
//     }
// }
// class xyz extends Test{
//   void show(int a, String b){
//     System.out.println("Method overriding in xyz cls");
//   }
// }
// public class methodoverriding {
//   public static void main(String[]args){
//        Test t = new Test();
//        t.show(10,"abc");
       
//        xyz x = new xyz();
//        x.show(20,"xyz");
//   } 
// }

//datatype of arg shld be same
// class Test{
//     void show(String a){
//       System.out.println("Method overriding in Test cls");
//     }
// }
// class xyz extends Test{
//   void show(String b){
//     System.out.println("Method overriding in xyz cls");
//   }
// }
// public class methodoverriding {
//   public static void main(String[]args){
//        Test t = new Test();
//        t.show("abc");
       
//        xyz x = new xyz();
//        x.show("xyz");
//   } 
// }

//1. do overriding methods have same return type?
//before java 1.4 v it is necessary but after that we can use covarant datatypes.
//covarant datatypes means if we have parent cls upper side then on lower side we can pass child cls method name 

// class Test{
//     Object show(String a){
//       System.out.println("Method overriding in Test cls");
//       return null;
//     }
// }
// class xyz extends Test{
//   String show(String b){
//     System.out.println("Method overriding in xyz cls");
//     return null;
//   }
// }
// public class methodoverriding {
//   public static void main(String[]args){
//        Test t = new Test();
//        t.show("abc");
       
//        xyz x = new xyz();
//        x.show("xyz");
//   } 
// }

// 2. child class access modifier must be higher than parent one
//public>private>protected>defualt...
// class Test{
//      void show(String a){  // here default, protected and public allwill work
//       System.out.println("Method overriding in Test cls");
//     }
// }
// class xyz extends Test{
//   public void show(String b){
//     System.out.println("Method overriding in xyz cls");
//   }
// }
// public class methodoverriding {
//   public static void main(String[]args){
//        Test t = new Test();
//        t.show("abc");
       
//        xyz x = new xyz();
//        x.show("xyz");
//   } 
// }

//---------------------------RULE1------------------------------
//overriding and exception handling : if parent class method is not throwing any error so child 
//class method can only be able to throw unchecked exception. If we explicity tries to throw checked
//exception it will throw error at compile time.

// class Test{
//      void show(){  
//       System.out.println("Method overriding in Test cls");
//     }
// }
// class xyz extends Test {
//   public void show() throws ArithmeticException{ // here throws ArithmeticException is an unchecked exception
//     System.out.println("Method overriding in xyz cls");
//   }
// }
// public class methodoverriding {
//   public static void main(String[]args){
//        Test t = new Test();
//        t.show();
       
//        xyz x = new xyz();
//        x.show();
//   } 
// }

// class Test{
//      void show(){  
//       System.out.println("Method overriding in Test cls");
//     }
// }
// class xyz extends Test {
//   public void show() throws Exception{ // here throws Exception is a checked exception
//     System.out.println("Method overriding in xyz cls");
//   }
// }
// public class methodoverriding {
//   public static void main(String[]args){
//        Test t = new Test();
//        t.show();
       
//        xyz x = new xyz();
//        x.show();
//   } 
// }

//---------------------------RULE2------------------------------
// if parent class method is throwing an error child class method can throw the same error
// or it will throw the child class of that thrown error. 

// class Test{
//      void show() throws RuntimeException{  
//       System.out.println("Method overriding in Test cls");
//     }
// }
// class xyz extends Test {
//   public void show() throws RuntimeException{ // here throws Exception is a checked exception
//     System.out.println("Method overriding in xyz cls");
//   }
// }
// public class methodoverriding {
//   public static void main(String[]args){
//        Test t = new Test();
//        t.show();
       
//        xyz x = new xyz();
//        x.show();
//   } 
// }

// class Test{
//      void show() throws RuntimeException{  
//       System.out.println("Method overriding in Test cls");
//     }
// }
// class xyz extends Test {
//   public void show() throws ArithmeticException{ // here ArithmeticException is a child cls exception of runtime
//     System.out.println("Method overriding in xyz cls");
//   }
// }
// public class methodoverriding {
//   public static void main(String[]args){
//        Test t = new Test();
//        t.show();
       
//        xyz x = new xyz();
//        x.show();
//   } 
// }

// here in child class method we are throwing parent cls of runtime exception so it will give error.

// class Test{
//      void show() throws RuntimeException{  
//       System.out.println("Method overriding in Test cls");
//     }
// }
// class xyz extends Test {
//   public void show() throws Exception{ // here ArithmeticException is a child cls exception of runtime
//     System.out.println("Method overriding in xyz cls");
//   }
// }
// public class methodoverriding {
//   public static void main(String[]args){
//        Test t = new Test();
//        t.show();
       
//        xyz x = new xyz();
//        x.show();
//   } 
// }

// //overriding and abstraction:
// abstract class Test{
//   abstract void  display();
//   void show(){
//     System.out.println("1");
//   }
// }
// class xyz extends Test{
//   void display(){

//   }
//   void show(){
//     System.out.println("2");
//   }
// }
// public class methodoverriding {
//   public static void main(String[]args){
//       //  Test t = new Test();
//       //  t.show();
       
//        xyz x = new xyz();
//        x.show();
//   } 
// }

//overriding and interface:

// interface test{
//   void display();
// }

// class xyz implements test{
//   public void display(){

//   }
//   void show(){
//     System.out.println("2");
//   }
// }
// public class methodoverriding {
//   public static void main(String[]args){
     
//        xyz x = new xyz();
//        x.show();
//   } 
// }

//we can call parent class method from child class method using super

// class Test{
//   void show(){
//     System.out.println("Parent cls method");
//   }
// }
// class XYZ extends Test{
//   super.show();
//   void show(){
//    System.out.println("Child cls method"); 
//   }
// }
// public class methodoverriding {
//   public static void main(String[]args){
     
//        XYZ x = new XYZ();
//        x.show();
//   } 
// }


// class Test{
//   final void show(){ // final and static method can be override and private will yes
//     System.out.println("Parent cls method");
//   }
// }
// class XYZ extends Test{
 
//   void show(){
//    System.out.println("Child cls method"); 
//   }
// }
// public class methodoverriding {
//   public static void main(String[]args){
     
//        XYZ x = new XYZ();
//        x.show();
//   } 
// }

class Test{
  synchronized void  show(){ // we can also use scriptfp  can be override
    //synchroixed pr scriptfp wont effect method overriding.
    System.out.println("Parent cls method");
  }
}
class XYZ extends Test{
  
  void show(){
   System.out.println("Child cls method"); 
  }
}
public class methodoverriding {
  public static void main(String[]args){
     
       XYZ x = new XYZ();
       x.show();
  } 
}