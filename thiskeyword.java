//this keyword is a reference variable that refers to the current cls instance variable and 
//refernce variable is a variable that refers to an object.
// public class thiskeyword {
//   public static void main(String[]args){
//     Test t = new Test();
//     t.set(20);
//     t.show();
//   }
// }
// class Test{
//   int i ;
//   void set(int x){
//     i = x;
//   }
//   void show(){
//     System.out.println(i);
//   }
// }

// public class thiskeyword {
//   public static void main(String[]args){
//     Test t = new Test();
//     t.set(20);
//     t.show();
//   }
// }
// class Test{
//   int i ;
//   void set(int i){
//     i = i;
//   }
//   void show(){
//     System.out.println(i);
//   }
// }

public class thiskeyword {
  public static void main(String[]args){
    Test t = new Test();
    t.set(20);
    t.show();
  }
}
class Test{
  int i ;
  void set(int i){
    this.i = i;
  }
  void show(){
    System.out.println(i);
  }
}