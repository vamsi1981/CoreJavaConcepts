public class ArrayListOperations{
public static void main(String args[]){
ArrayList<Integer> myList = new ArrayList<Integer>(3); 
  
        // use add() method to add elements in the list 
        myList.add(12); 
        myList.add(25); 
        myList.add(45); 
        for (int i = 0; i < 3; i++)
      {
         System.out.println(myList.get(i).toString());
      }
      myList.remove(1);
}
}
        
