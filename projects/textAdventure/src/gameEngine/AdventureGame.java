package gameEngine;


import java.util.ArrayList;

import gameObjects.*;
import gameObjects.rooms.Room;

public class AdventureGame {
    
    public static void main(String[] args){
       
       Room livingRoom = new Room("Living Room", getDesciption(0));
       Room hallway = new Room("Hallway",getDesciption(1));
       Room doorHallway = new Room("DoorHallway",getDesciption(2));
       Room kitchen = new Room("kitchen",getDesciption(3));
       Room patio = new Room("patio",getDesciption(4));
       Room nursery = new Room("nursery",getDesciption(5));
       Room scritchesBathRoom = new Room("Scritch's Bathroom",getDesciption(6));
       Room bathRoom = new Room("bathRoom Bathroom",getDesciption(7));
       Room bedRoom = new Room("bedroom ",getDesciption(8));

    livingRoom.link(hallway, patio, kitchen, Direction.NOEXIT);    
    bathRoom.link(Direction.NOEXIT, bedRoom, Direction.NOEXIT, Direction.NOEXIT);
    scritchesBathRoom.link(Direction.NOEXIT, hallway, Direction.NOEXIT, Direction.NOEXIT);
    bedRoom.link(bathRoom, hallway, Direction.NOEXIT, Direction.NOEXIT);
    nursery.link(Direction.NOEXIT, hallway, Direction.NOEXIT, Direction.NOEXIT);
    patio.link(Direction.NOEXIT, livingRoom, Direction.NOEXIT, Direction.NOEXIT);
    kitchen.link(Direction.NOEXIT, Direction.NOEXIT, livingRoom, doorHallway);
    doorHallway.link(Direction.NOEXIT, hallway, kitchen, scritchesBathRoom);
    hallway.link(bedRoom, livingRoom, doorHallway, nursery);

        Actor playerOne = new Actor("player", "our intrepid explorer", livingRoom);
        GameLogic adventureGame = new GameLogic(playerOne);
        try{
           adventureGame.start();
        }catch(Exception ex){
            System.out.println(ex.getStackTrace());
        }
    }
    public static String getDesciption(int key){
        ArrayList<String> descriptions = new ArrayList<>();

        //0
        String livingRoom = "Your standing in an empty living room, static flickers on the tv.";
        descriptions.add(livingRoom);
        //1
        String hallway = "Main hallway. Closet sits half open. nothing suspicious.";                        
        descriptions.add(hallway);
       
        //2
        String doorHallway = "The only exit. coats hanging on a hanger thats barly attached to the wall.. maybe i should fix that";                        
        descriptions.add(doorHallway);
       
        //3
        String kitchen = "dirty dishes in the sink, and a half a loaf of breads on the floor... what happened here";                        
        descriptions.add(kitchen);
        
        //4
        String patio = "The patio.A view of the hospital and mt doug. a seat and some dead flowers. Maybe you should have a smoke.";                        
        descriptions.add(patio);
      
        //5
        String nursery = "The crib sits against a wall adorned by forest animals. Your in Maya's territoy now.";                        
        descriptions.add(nursery);
        //6
        String scritches = "Scritches domain. The air is pungent. a mix of cat piss and hawian mist";                        
        descriptions.add(scritches);
       
        //7
        String bathRoom = "The master bathroom, Tiny hairs litter the sink ";                        
        descriptions.add(bathRoom);
        
        //8
        String bedRoom = "Your in the master bedroom. the bed is neatly made. the window is shut tightly.";                        
        descriptions.add(bedRoom);
        
        
        return descriptions.get(key);
    }
    
    
  

    
}
