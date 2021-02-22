package gameObjects.rooms;

import gameObjects.Thing;

public class Room extends Thing{
    
    private LinkedRoom<Room> thisRoom;
    public Room(String name, String description ){
      thisRoom = new LinkedRoom<>(this);
      setName(name);
      setDescription(description);
    }
    public LinkedRoom<Room> linked(){
        return this.thisRoom;
    }
    public void link(Room roomOne, Room roomTwo, Room roomThree, Room roomFour)
        throws NullPointerException{
        this.thisRoom.setForward(roomOne.linked());
        this.thisRoom.setBack(roomTwo.linked());
        this.thisRoom.setRight(roomThree.linked());
         this.thisRoom.setLeft(roomFour.linked());
    }

}