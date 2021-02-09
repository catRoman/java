/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.NoSuchElementException;
import container.*;
import exceptions.*;

public class Test {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
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
   // System.out.println((int)(Math.random() * (c.size()-1)));
    System.out.println(c.toString());
    c.clear();
    System.out.println("maxsize()" + c.maxSize());
System.out.println(c.toString());
    c.clear();
    System.out.println(c.toString());
    c.add("test1");
    c.add("test2");
    System.out.println(c.toString());
  }


}
