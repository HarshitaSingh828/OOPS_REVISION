// inheritance in java  means inheriting the properties of parent class to child class.
// inheritance can be achieved using extends keywords
//what kind of relationship do we have between animal and class?
//Dog IS-A Animal , Sparrow IS-A Bird 
//inheritance always have IS-A relationship
//Advantage: 1. code reusablitiy 2. we can achieve polymorphism through this.
//Disadvantages: If we change in particular function then it will be changed for every class.




class Animal{
     void run(){
      System.out.println("I am running");
     }
}
class Dog extends Animal{
      
}
 class inheritance extends Animal{
    public static void main(String[]args){
      Dog d = new Dog();
      d.run();
    }
}



