// DEFAULT CONSTRUCTORS
// public class constructors {
//    public static void main (String[]agrs){
//         Tests t = new Tests();
//    }
// }
// class Tests{
    
// }

//NO ARG CONSTRUCTORS
// public class constructors {
//    public static void main (String[]agrs){
//         Tests t = new Tests();
//    }
// }
// class Tests{
//      Tests(){
//         System.out.println("asdff");
//      }
// }

//PARAMETERISED CONSTRUCTORS

// public class constructors {
//    public static void main (String[]agrs){
//         Tests t = new Tests("abc");
//    }
// }
// class Tests{
//      Tests(String a){
//         System.out.println("asdff");
//      }
// }


//WHAT IF THERE IS NO CONSTRUCTORS

// class Employee{
//      String name;
//      int empid;
// }
// public class constructors {
//   public static void main(String[]args){
//     Employee e1 = new Employee();
//     Employee e2 = new Employee();
//     System.out.println(e1.name+ " " +e1.empid);
//     System.out.println(e2.name+ " " +e2.empid);
//   }
  
// }

// class Employee{
//      String name = "black";
//      int empid = 10;
// }
// public class constructors {
//   public static void main(String[]args){
//     Employee e1 = new Employee();
//     Employee e2 = new Employee();
//     System.out.println(e1.name+ " " +e1.empid);
//     System.out.println(e2.name+ " " +e2.empid);
//   }
  
// }

// class Employee{
//      String name ;
//      int empid ;
// }
// public class constructors {
//   public static void main(String[]args){
//     Employee e1 = new Employee();
//     Employee e2 = new Employee();
//     e1.name = "harshita"; e1.empid= 21;
//     e2.name = "singh"; e2.empid  = 20;
//     System.out.println(e1.name+ " " +e1.empid);
//     System.out.println(e2.name+ " " +e2.empid);
//   } 
// }


class Employee{
     String name ;
     int empid ;
     Employee(String n, int e){
       this.name = n;
       this.empid = e;
     }
}
public class constructors {
  public static void main(String[]args){
    Employee e1 = new Employee("harshita",20);
    Employee e2 = new Employee("singh",21);
   
    System.out.println(e1.name+ " " +e1.empid);
    System.out.println(e2.name+ " " +e2.empid);
  } 
}
