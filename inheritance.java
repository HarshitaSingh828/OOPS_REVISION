// inheritance in java  means inheriting the properties of parent class to child class.
// inheritance can be achieved using extends keywords
//what kind of relationship do we have between animal and class?
//Dog IS-A Animal , Sparrow IS-A Bird 
//inheritance always have IS-A relationship
//Advantage: 1. code reusablitiy 2. we can achieve polymorphism through this.
//Disadvantages: If we change in particular function then it will be changed for every class.

// class Animal{
//   void run(){
//     System.out.println("I am running");
//   }
// }
// class Dog extends Animal{
  
// }
// class inheritance extends Animal{
//   public static void main(String[]args){
//     Dog d = new Dog();
//     d.run();
//   }
// }

//types of inheritance : single, multilevel, hierarchical, multiple, hybrid

// class A{
//   void showA(){
//     System.out.println("Method of class A");
//   }
// }
// class B extends A{
//   void showB(){
//     System.out.println("Method of class B");
//   }
  
// }
// class inheritance {
//   public static void main(String[]args){
//     A obj1 = new A();
//     obj1.showA();
//   }
// }

// here through obj1 we cant call showb
// class A{
//   void showA(){
//     System.out.println("Method of class A");
//   }
// }
// class B extends A{
//   void showB(){
//     System.out.println("Method of class B");
//   }
  
// }
// class inheritance {
//   public static void main(String[]args){
//     A obj1 = new A();
//     obj1.showA();
//     obj1.showB();
//   }
// }


// class A{
//   void showA(){
//     System.out.println("Method of class A");
//   }
// }
// class B extends A{
//   void showB(){
//     System.out.println("Method of class B");
//   }
  
// }
// class inheritance {
//   public static void main(String[]args){
//     B obj1 = new B();
//     obj1.showA();
//     obj1.showB();
//   }
// }

// class A{
//   void showA(){
//     System.out.println("Method of class A");
//   }
// }
// class B extends A{
//   void showB(){
//     System.out.println("Method of class B");
//   }
  
// }
// class C extends B{
//   void showC(){
//     System.out.println("Method of class C");
//   }
// }
// class inheritance {
//   public static void main(String[]args){
//     // A obj1 = new A();
//     // obj1.showA();
//     // obj1.showB();
//     // obj1.showC();

//     // B obj2 = new B();
//     // obj2.showA();
//     // obj2.showB();
//     // obj2.showC();
    
//     C obj3 = new C();
//     obj3.showA();
//     obj3.showB();
//     obj3.showC();
//   }
// }


// class A{
//   void showA(){
//     System.out.println("Method of class A");
//   }
// }
// class B extends A{
//   void showB(){
//     System.out.println("Method of class B");
//   }
  
// }
// class C extends A{
//   void showC(){
//     System.out.println("Method of class C");
//   }
// }
// class inheritance {
//   public static void main(String[]args){
    // A obj1 = new A();
    // obj1.showA();
    // obj1.showB();
    // obj1.showC();

    // B obj2 = new B();
    // obj2.showA();
    // obj2.showB();
    // // obj2.showC();
    
    // C obj3 = new C();
    // obj3.showA();
    // obj3.showB();
    // obj3.showC();
//   }
// }

// we dont have multiple inheritance in java coz let say we have a method in
//  class a as show and in class b as show then if c cls extends it so it will get
//   confuse to which cls method it call.
// and will give ambiguity error  and refer 2nd image of readme
//multiple inheritance

// class A{
//   void show(){
//     System.out.println("I am in method A");
//   }
// }
// class B {
//   void show(){
//     System.out.println("I am in method B");
//   }
// }
// class C extends A B{
//   void show(){
//     System.out.println("I am in method C");
//   }
// }
// class inheritance{
//   public static void main(String[]args){
//     C obj = new C();
//     obj.show();
//   }
// }

//if there is only one class it will inherit object class every class in java inherit some other class.
//object cls is the parent cls 


//we cannot inherit constructor and private method of parent class.

class A{
  A(){
    System.out.println("its raining");
  }
 private void AA(){
    System.out.println("I am happy");
  }
}
class B extends A{

}
class inheritance{
  public static void main(String[]args){
    B bb = new B();
    bb.AA();
  }
}