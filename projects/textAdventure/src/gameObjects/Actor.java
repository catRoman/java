package gameObjects;

import gameObjects.rooms.Room;

public class Actor extends Thing {
    private Room location;

    public Actor(String name, String description, Room location){
        super.setName(name);
        super.setDescription(description);
        this.location = location;
        
    }
    public void setLocation(Room location) {
        this.location = location;
    }
    public Room getLocation() {
        return location;
    }
    
    

    
}
