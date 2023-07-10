//super keyword refers to parent class object

class A{
  int a = 10;
  
}
class B extends A{
  int a = 20;
  void show(int a){
    // System.out.println(a);
    // System.out.println(this.a);
       System.out.println(super.a);
}
}
public class superkeyword{
  public static void main(String[]args){
    B b = new B();
    b.show(30);
    
  }
}
