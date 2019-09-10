/**
 * Animal class (also called as parent, super or base)
 *  
 */
class Animal {
 String type;

 public String getType() {
  return type;
 }

 public void setType(String type) {
  this.type = type;
 }

 public void sound() {
  System.out.println("Makes sound");
 }
}

class Dog extends Animal {

 // Overriding super class behavior
 @Override
 public void sound() {
  System.out.println("Dog Barks and makes sound");
 }
}
