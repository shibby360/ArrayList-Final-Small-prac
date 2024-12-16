import java.util.ArrayList;

public class Main{
	
    public static void main(String[] args) {
            LegoPerson bob = new LegoPerson("Bob", 28);
            LegoPerson cindy = new LegoPerson("Cindy", 10);
            LegoPerson jasper = new LegoPerson("Jasper", 33);
            LegoPerson saul = new LegoPerson("Saul", 65);

            ArrayList<LegoPerson> legos = new ArrayList<LegoPerson>();

            legos.add(bob);
            legos.add(cindy);
            legos.add(jasper);
            legos.add(saul);
            
            System.out.println();
            System.out.println("random lego");

	//  1. Write a method that will return a random lego object from the ArrayList. Call this method from the legoperson method to test it. 

		System.out.println(randLego(legos).getName());
		System.out.println("all legos print");
		
    // 2. Write a method that will return a String with the names of all of the Lego Objects in legos, separated by a dash. For example: bob-cindy-jasper-saul 
		// note: no - at the end of the string! 

		System.out.println(allLegos(legos));
		// Copy the items from the ArrayList to a new LegoPerson array called myLegos[]
      LegoPerson[] myLegos = new LegoPerson[legos.size()];
      for(int i = 0; i < legos.size(); i++) {
        myLegos[i] = legos.get(i);
      }
      System.out.println("all legos array");


    // 3. Print the name of each Lego in myLegos to check to see if you are correct!
      for(LegoPerson x : myLegos) {
        System.out.println(x.getName());
      }
		System.out.println();
		System.out.println("all odd ages removed");

		
// 4. Write a method that will remove the Lego objects from the Array that have an age that is an odd number. YOU MUST USE MODULO FOR THIS! Call this method in the legoperson method. 
      for(int i = legos.size()-1; i >= 0; i--) {
        if(legos.get(i).getAge() % 2 == 1) { legos.remove(i); }
      }
      for(LegoPerson x : legos) {
        System.out.println(x.getName());
      }
		}
        //Write methods here
    public static LegoPerson randLego(ArrayList<LegoPerson> legos) {
      return legos.get((int)(Math.random() * legos.size()));
    }
    public static String allLegos(ArrayList<LegoPerson> legos) {
      String temp = "";
      for(int i = 0; i < legos.size()-1; i++) {
        temp += legos.get(i).getName() + '-';
      }
      return temp+legos.get(legos.size()-1).getName();
    }
	}