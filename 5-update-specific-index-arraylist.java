/*
Our bees are going on strike, and they demand new names! Given an ArrayList of newNames in .renameBees(), update each bee’s name to a name in the ArrayList at the corresponding index.

For example, say we have the following names: {“jamie”, “alex”, “jeremy”}. The bee should index 0 should get the name “jamie”. The second bee should get the name “alex” and the third bee should get the name “jeremy”.

If there are not enough names for every bee in the beeList, then you don’t have to update the names for the remaining bees. (We can talk to them to work out a compromise).

Hint
Since we want to match up the bees in the beeList to a name in newNames, we can iterate through both of the ArrayLists simultaneously.

Hint
You can update a bee’s name using its .setName() method.

Hint
Let’s think about what some possible scenarios
There are more names than bees.
There are more bees than names.
There are the same number of bees as names.
For each of these scenarios, what checks can we make in our loop to make sure we don’t try to access elements outside of the ArrayLists?
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

  public void renameBees(ArrayList<String> newNames) {
    int shorterList = this.beeList.size();
    if (newNames.size() < this.beeList.size()){
      shorterList = newNames.size();
    }

    // Since we want to match up the bees in the beeList to a name in newNames, we can iterate through both of the ArrayLists simultaneously.
    for (int i=0; i<shorterList; i++){
      this.beeList.get(i).setName(newNames.get(i));
    }

  }

  public static void main(String[] args) {
    BeeHive myHive = new BeeHive(3);
    ArrayList<String> newNames = new ArrayList<String>();
    newNames.add("bob");
    newNames.add("macey");
    newNames.add("anna");

    myHive.renameBees(newNames);
   
    // Print out the elements in the bee list to make sure the new bees were added
    for (Bee b : myHive.beeList) {
      System.out.println(b.getName());
    }
  }
}

/*
The key to this problem is knowing what our limits are. There are two ArrayLists that we want to traverse, but the length of both cannot be guaranteed. What we do know is that we only want to traverse as far as the shortest list.

If there are more names than bees, then we don’t need to traverse through all the names available. We can simply stop when all the bees’ names are updated.

If there are more bees than names, then we should only traverse through all the names available.

If there are the same number of bees as there are names, then we can traverse through all of the names and bees.

This means that before we do any traversing, we want to set the terminating condition for our for loop to be whatever the smallest ArrayList is. Then, we can iterate through both lists like normal, and use .get() to access the elements at the counter variable without worrying about an IndexOutOfBounds error. From here, we can update each Bee‘s name using .setName().
*/
