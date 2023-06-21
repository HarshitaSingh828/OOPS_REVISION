// class classesandobjects{
//   public static void main(String[]args){
//       Animal b = new Animal();
//       b.eat();
//   }

// }
// class Animal{
//      void eat(){
//       System.out.println("I am eating");
//      }
// }

// class classesandobjects{
//   public static void main(String[]args){
//       Animal b = new Animal();
//       b.eat();
//       b.run();
//   }

// }
// class Animal{
//      void eat(){
//       System.out.println("I am eating");
//      }
//      void run(){
//       System.out.println("I am running");
//      }
// }

// class classesandobjects{
//   public static void main(String[]args){
//       Animal b = new Animal();
//       b.eat();
//       b.run();
//       birds bb = new birds();
//       bb.fly();
//   }

// }
// class Animal{
//      void eat(){
//       System.out.println("I am eating");
//      }
//      void run(){
//       System.out.println("I am running");
//      }
// }

// class birds{
//   void fly(){
//     System.out.println("I am flying");
//   }
// }

//HOW TO INITIALISE OBJECTS --> using reference variable
// class classesandobjects{
//   public static void main(String[]args){
//       Animal b = new Animal();
//       b.color = "black";
//       b.age = 12;
//       System.out.println(b.color + " "+ b.age);
//   }

// }
// class Animal{
//      String color;
//      int age;
// }

//USING METHODS

class classesandobjects{
  public static void main(String[]args){
      Animal b = new Animal();
     b.initobject("black", 12);
     b.display();
  }
}
class Animal{
     String color;
     int age;

     void initobject(String c, int a){
      color = c;
      age = a;
     }
     void display(){
      System.out.println(color + " "+age);
     }
}