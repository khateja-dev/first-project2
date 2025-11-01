 abstract class Animal {
   abstract void walk();
 Animal(){
    System.out.println("creating a new animal");
 }

  public  void eat(){
    System.out.println( "its can eat");
   }
}
 

 class Horse extends Animal {

    Horse(){
        System.out.println("created a horse");
    }
    public void walk(){
        System.out.println("walks on 4 leg");
    }   
}

 class Hen extends Animal  {
    public void walk(){
        System.out.println("walks on 2 leg");
    }
    
}

public class oop {
    public static void main(String[] args) {
        Horse horse = new Horse();
        Hen hen = new Hen();
        
        horse.walk();
        hen.walk();
        horse.eat();
        
    }
}
