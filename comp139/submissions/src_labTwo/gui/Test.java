package gui;
/*
 * LabOne Test - 
 * 
 * i opted to test against the memory game instead of writing my own program
 * for this lab, it actually was quite the doozy to get it working, i typically
 * only print debug but i broke down and started learning to use the ide debugger
 * and thankfully i was able to step through the container until i relieze my
 * error. 
 * 
 * The memory game would run through the test method no problem but once it tryed
 * to re-add the strings to container it would throw 
 * 
 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out 
 * of bounds for length 0
 *    at container.ArrayContainer.add(ArrayContainer.java:59)
 * 
 * i couldnt understand it. turns out i just wasnt reading the exception thoughourly, 
 * in my remove() method i implement erasing the the objects value from the stack by appending two
 * copies of the the originial array , one before the element to be removed, and one
 * after. In order to store the copies i would instantiate a temp array. what i had origanly
 * done was this
 *    T[] temp = (T[])(new Object[container.length-1]);
 * 
 * it would work fine to hold the array and once refrenced to the container i could add or remove
 * as normal the issue only arose once i set the capacity to a specific number, added the same number
 * of objects and then removed all of the them from the array. i eould end up with a container
 * based apon an array with length zero. its obvious now what i did and i think i understand what i was
 * thinking when first writing the temp array. Since my clear method would iterate backwards through the 
 * container and call to remove only the objects added based on where nextIndex(essential same as top in a stack) 
 * was at the time the clear method was called, this error never arose if the default constructor of the
 * container was used as i never origanlly tested past the default capacity, so the actual array length
 * was always positve.
 * 
 * 
 * Simple fix, learnt a few things, played with a debugger good times.
 * 
 * 
 * Catlin Roman - 08/02/21
 * 
 */

import java.util.NoSuchElementException;
import container.*;
import exceptions.*;

public class Test {

  /**
   * Test Driveer
   */
  public static void main(String[] args) {

    //Container A
    ArrayContainer<String> c = new ArrayContainer<String>(4);
    System.out.println("Size: " + c.size());
    System.out.println("isEmpty()? = " + c.isEmpty());
    c.add("a");
    c.remove("a");
    //try{
     // c.remove("a");
    //}catch (EmptyContainerException ex){
     // System.out.println(ex.getMessage());
   // }
    System.out.println("isEmpty()? = " + c.isEmpty());
    System.out.println("Test: " + c.toString());
    System.out.println("Size: " + c.size());
    String a = "a";
    String b = "a";
    System.out.println(a == b);
    System.out.println(a.equals(b));
    System.out.println("Contains: " + c.contains("a"));
    c.add("b");
    c.add("c");
    c.add("d");
    c.add("e");
    c.add("f");
    c.add("g");
    c.add("h");
    c.add("i");
    c.add("j");
    c.add("k");
    c.add("l");
    c.add("m");

    System.out.println(c.toString());
    try {
      c.remove("a");
    } catch (EmptyContainerException | NoSuchElementException ex) {
      System.out.println(ex.getMessage());
    }
    System.out.println(c.toString());
    
    try {
      c.removeRandom();
    } catch (EmptyContainerException ex) {
      System.out.println(ex.getMessage());
    }
    System.out.println(c.toString());
    try {
      c.remove("e");
    } catch (EmptyContainerException | NoSuchElementException ex) {
      System.out.println(ex.getMessage());
    }
    System.out.println("Size: " + c.size());
   
    System.out.println(c.toString());
    c.clear();
    System.out.println("maxsize()" + c.maxSize());
    System.out.println(c.toString());
    c.clear();
    System.out.println(c.toString());
    c.add("test1");
    c.add("test2");
    System.out.println(c.toString());

    //container D
    ArrayContainer<Integer> d = new ArrayContainer<>(25);
    for(int i=0; i < 25; i++){
      d.add(i);
    }
    System.out.println(d.toString());
    d.clear();
    for(int i=5; i > 0; i--){
      d.add(i);
    }
    System.out.println(d.toString());

    //container E

    ArrayContainer<Sandwhich> lunchBox = new ArrayContainer<>();
    lunchBox.add(new Sandwhich("turkey"));
    lunchBox.add(new Sandwhich("ham"));
    lunchBox.add(new Sandwhich("roastBeef"));
    lunchBox.add(new Sandwhich("tuna"));
    lunchBox.add(new Sandwhich("RoastBeef"));

    System.out.println(lunchBox.toString());
    System.out.println("Does the lunch box have a roastbeef sandwhich-->" + lunchBox.contains(new Sandwhich("roastBeef")));
    System.out.println("Does the lunch box have a cheese sandwhich-->" + lunchBox.contains(new Sandwhich("cheese")));
    
  }
}
  /**Simple test class for use with testing generic container */
  class Sandwhich{
    private String meat;
    /**Default Sandwhich Constructor
     * @param meat type of meat
     */
    public Sandwhich(String meat){
      this.meat = meat;
    }
    /**Simple getter 
     * @return meat type
     */
    public String getMeat(){
      return this.meat;
    }
    /**used for determining equality of sandwhiches
     * @param o sandwhich to compar to this instance
     */
    @Override
    public boolean equals(Object o){
        if (o == this)
          return true;
        
        if (!(o instanceof Sandwhich))
          return false;
        
        Sandwhich o1 = (Sandwhich)o;
        if(this.getMeat().equals(o1.getMeat()))
          return true;

        return false;

        
    }
    /**returns the type of sandwhich
     * @return textual representation of sandwhich
     */
    @Override
    public String toString(){
      return meat + " sandwhich";
    }
  }



