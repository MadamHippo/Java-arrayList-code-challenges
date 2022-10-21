/*
A scavenger bee has to leave for an expedition! Given the name of the bee that has to leave home, update the corresponding bee in the beeList to be away.
Each bee has an isHome property that determines where the bee is. To update this property to false, you can call the bee’s .leaveHome() method.

Hint:
How would you manually find this bee in the beeList to call its .leaveHome() method?

Hint:
Remember, string comparisons can be done with the string’s .equals() method, which returns true if the two strings are equal, and false otherwise.
*/

import java.util.ArrayList;

public class BeeHive {
  private ArrayList<Bee> beeList;

  public BeeHive(int numBees) {
    this.beeList = new ArrayList<Bee>();
    for (int i = 0; i < numBees; i++) {
      this.beeList.add(new Bee("bee" + i));
    }
  }

  public ArrayList<Bee> getBeeList() {
    return this.beeList;
  }

  public void leaveHome(String beeName) {
    for (Bee bee : this.beeList) {
      if (bee.getName().equals(beeName)) {
        bee.leaveHome();
      }
    } 

/*
In order to see if we have the right Bee, we use the equals() method to compare every Bee’s name to the name we’re looking for.
*/

  }

  public static void main(String[] args) {
    BeeHive myHive = new BeeHive(365);
    myHive.leaveHome("bee43");

    // Print bee's status to make sure it is no longer home
    System.out.println(myHive.beeList.get(43).isHome());
  }
}
