/*

ArrayLists hold data in a very similar way to arrays, but the biggest difference is that ArrayLists have a layer of abstraction built on top of arrays. This layer helps to make ArrayLists easier to use as the size of the array is no longer fixed, but can be dynamically resized as needed. Just like arrays, we can also use loops to traverse ArrayLists.

The problems presented in this code challenge are designed to give you practice looping through ArrayLists of objects. If you are looking for more practice with ArrayLists of primitive data types and Strings, take a look at our array loop code challenges and use ArrayLists instead of arrays.

Say you are a beekeeper and each bee in your beehive is represented by your Bee class:
*/

public class Bee {
  private String name;
  private boolean isHome;
 
  public Bee(String name) {
    this.name = name;
    this.isHome = true;
  }
 
  public String getName() {
    return this.name;
  }
 
  public void setName(String newName) {
    this.name = newName;
  }
 
  public boolean isHome() {
    return this.isHome;
  }
 
  public void leaveHome() {
    this.isHome = false;
  }
 
  public void returnHome() {
    this.isHome = true;
  }
} 


// We could use an ArrayList to keep track of all the bees in our hive.

import java.util.ArrayList;
 
public class BeeHive {
  private ArrayList<Bee> beeList;
 
  public BeeHive(int numBees) {
    this.beeList = new ArrayList<Bee>();
    for (int i = 0; i < numBees; i++) {
      this.beeList.add(new Bee("bee" + i));
    }
  }
 
  public static void main(String[] args) {
    BeeHive myHive = new BeeHive(365);
  }
}
