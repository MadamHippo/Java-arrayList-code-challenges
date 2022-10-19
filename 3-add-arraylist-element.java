/*
Last night our Queen Bee had a long stay at the bee maternity ward! This morning we discovered that she added new members to our bee hive! Given an ArrayList of the names for our new bees, write a method, .addBees() to add the new bees into our beeList family.

Hint:
When you create a new Bee instance, you will want to pass in the name string to the constructor so that the new bee is created with the name.

Hint:
The ArrayList has an .add() method which expects an element. It will insert the element at the end of the list and update the list’s size.
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

  public void addBees(ArrayList<String> beeNames) {
    for (String newBees : beeNames) {
      this.beeList.add(new Bee(newBees));
    }

  }

  public static void main(String[] args) {
    BeeHive myHive = new BeeHive(3);
    ArrayList<String> newBees = new ArrayList<String>();
    newBees.add("bob");
    newBees.add("macey");
    newBees.add("anna");

    myHive.addBees(newBees);
   
    // Print out the elements in the bee list to make sure the new bees were added
    for (Bee b : myHive.beeList) {
      System.out.println(b.getName());
    }
  }
}

/* This time we’re not looping through the beeList. Instead, we’re looping through the ArrayList of names given to us. We need to use the Bee constructor to create a new Bee for every name in that list.
*/
