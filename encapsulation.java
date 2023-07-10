// class Employee{
//   int emp_id;
// }
// public class encapsulation {
//   public static void main(String[]args){
//     Employee e = new Employee();
//     e.emp_id = 10;
//      System.out.println(e.emp_id);
//   }
// }

class Employee{
   private int emp_id;
   public void setEmp(int empid){
    emp_id = empid;
   }
   public int getEmp(){
    return emp_id;
   }
}
public class encapsulation {
  public static void main(String[]args){
    Employee e = new Employee();
     e.setEmp(10);
     System.out.println(e.getEmp());
  }
}
