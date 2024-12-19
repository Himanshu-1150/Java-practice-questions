class Inheritence{
  public static void main (String args[]){
    System.out.println("Inhritence");
    Animal horse = new Animal();
    horse.eat();
    horse.breathe();
    Fish f = new Fish();
    f.breathe();
    f.swim();
    f.eat();
               
    System.out.println(f.color);
  }
}
class Animal {
  String color; 
  
  void eat () {
    System.out.println("eats");
  }
  void breathe () {
    System.out.println("breathe");
  }
}
// derived class
class Fish extends Animal {
  int fins ;
  void swim () {
    System.out.println("swim in water");
  }
}
