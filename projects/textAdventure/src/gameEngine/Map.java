/*
package gameEngine;



import gameObjects.rooms.Room;

public class Map {
    

  Room doorHallway, livingRoom, patio, hallway, nursery, kitchen, bedRoom, bathRoom, scritchesBathRoom; 
      public Map(){
        
      }
      public void populateMap(){
        this.livingRoom = new Room("Living Room","livingroom description", getHallway(), getPatio(), getKitchen(), Direction.NOEXIT);    
       this.hallway = new Room("Hallway","hallway description", bedRoom, livingRoom, doorHallway, nursery);
       this.doorHallway = new Room("Hallway","hallway to door description", Direction.NOEXIT, hallway, kitchen, scritchesBathRoom);
       this.kitchen = new Room("kitchen","kitchen description", Direction.NOEXIT, Direction.NOEXIT, livingRoom, hallway);
       this.patio = new Room("patio","patio description", Direction.NOEXIT, livingRoom, Direction.NOEXIT, Direction.NOEXIT);
       this.nursery = new Room("nursery","nursery description", Direction.NOEXIT, hallway, Direction.NOEXIT, Direction.NOEXIT);
       this.scritchesBathRoom = new Room("Scritch's Bathroom","scritch's bathroom description", Direction.NOEXIT, hallway, Direction.NOEXIT, Direction.NOEXIT);
       this.bathRoom = new Room("bathRoom Bathroom","bathroom description", Direction.NOEXIT, bedRoom, Direction.NOEXIT, Direction.NOEXIT);
       this.bedRoom = new Room("bedroom ","bedroom description", bathRoom, hallway, Direction.NOEXIT, Direction.NOEXIT);
      }
      public Room getStartLocation(){
          return this.livingRoom;
      }
     
    
}
*/