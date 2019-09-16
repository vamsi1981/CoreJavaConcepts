class Animals{
  public void sound(){
    System.out.println("This is parent class.");
  }
}
class Pets extends Animals{
  public void sound(){
    System.out.println("Dogs bark");
  }
  public void sound(int num){
    System.out.println("Cats meow");
  }
}
public class SoundsOverload{
public static void main(String[] args){
  Pets p = new Pets();
  p.sound();
  p.sound(3);
}
}
