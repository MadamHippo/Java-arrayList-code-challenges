/*
Some of the bees wanted to move out of the hive to make room for new family members. In .moveOutBees(), remove every other bee in the list of bees, starting with the first bee.

The ArrayList has a .remove() method that will allow you to remove the element at the given index. The list will then update in size.

When iterating through the list, how would the list be altered when you remove an element? What would be the next element in the iteration if the previous element was removed?
After you remove the bee at the 0th index, the second bee is now at the 0th index, and the third bee is at the 1st index. At what index is the next bee that we need to remove?
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

  public void moveOutBees() {
    for (int i = 0; i < this.beeList.size(); i++){
      this.beeList.remove(i);
      // this means every other bee gets removed 
    }

  }

  public static void main(String[] args) {
    BeeHive myHive = new BeeHive(365);
    myHive.moveOutBees();
   
    // Print out the elements in the bee list to make sure the new bees were removed
    for(Bee b : myHive.beeList){
      System.out.println(b.getName());
    }
  }
}

/* This one looks surprisingly simple, but there are some subtleties to it. Because we’re looking to remove every other Bee, we can just call remove() in our loop. It looks like this will remove every Bee, but it will actually remove every other Bee. A Bee will be removed, all other Bees will be shifted to the left, and then i increments by 1. The combination of Bees shifting and incrementing the counter means that a Bee will be skipped, resulting in every other Bee getting removed.
*/
