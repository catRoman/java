package gameEngine;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import gameObjects.Actor;
import gameObjects.rooms.Room;


public class GameLogic {
    private Actor player;

    public GameLogic(Actor player){
        this.player = player;
    }
    public List<String> getCommands(){
        List<String> commands = new ArrayList<>(Arrays.asList("take", 
                                                                "drop",
                                                                "forward",
                                                                "f",
                                                                "back",
                                                                "b",
                                                                "left",
                                                                "l",
                                                                "right",
                                                                "r",
                                                                "move",
                                                                "look"));

        return commands;
    }
    public List<String> getObjects(){

        List<String> objects = new ArrayList<>(Arrays.asList("sword", "ring", "snake"));
        return objects;
    }
    public void start() throws Exception {
        
        BufferedReader in;
        String input;
        String output;

        in = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.print("> ");
            input = in.readLine();
            output = runCommand(input);
            System.out.println(output);
        }while(!"q".equals(input));
    }
    public String runCommand(String inputstr){
        List<String> wl;
        String s = "ok";
        String lowstr = inputstr.trim().toLowerCase();

        if(!lowstr.equals("q")){
            if(lowstr.equals("")) {
                s = "You must enter a command";
            }else {
                wl = wordList(lowstr);
              //  wl.forEach((astr) -> System.out.print(astr));
                if(wl.size() == 1){
                    s = processVerb(wl);
                }else if (wl.size() == 2){
                    s = processVerbNoun(wl);
                }else if (wl.size() > 2)
                    s = "Currently only can recognize two words ata time";
            }
        }
        return s;
    }
    public List<String> wordList(String input){
        String delims = "[ \t,.:;?!\"']+";
        List<String> strlist = new ArrayList<>();
        String[] words = input.split(delims);

        for(String word : words) {
            strlist.add(word);
        }
        return strlist;
    }

    public String processVerbNoun(List<String> wordList){
        String msg = "";
        String verb = wordList.get(0);
        String noun = wordList.get(1);

        if(!getCommands().contains(wordList.get(0)))
               msg += verb + " is not a known action! ";
    
        if(!getObjects().contains(wordList.get(1)))
            msg += noun + " is not a known object! ";

        msg += " (two words not yet implemented)";
        return msg;
    }
    public String processVerb(List<String> wordList){
        String verb;
        String msg = "";
        verb = wordList.get(0);
        if(!getCommands().contains(wordList.get(0)))
            msg = verb + " is not a known action!";

            switch(verb) {
                case "f":
                case "forward":
                    moveTo(this.player,Direction.FORWARD);
                    if(!this.player.getNullity())
                        msg = this.player.getLocation().getDescription();
                    break;
                case "b":
                case "back":
                    moveTo(this.player, Direction.BACK);
                    if(!this.player.getNullity())
                        msg = this.player.getLocation().getDescription();
                    break;
                case "l":
                case "left":
                    moveTo(this.player, Direction.LEFT);
                    if(!this.player.getNullity())
                        msg = this.player.getLocation().getDescription();
                    break;
                case "r":
                case "right":
                    moveTo(this.player, Direction.RIGHT);
                    if(!this.player.getNullity())
                        msg = this.player.getLocation().getDescription();
                    break;
                case "look":
                    msg = this.player.getLocation().getDescription();
                }
        
        return msg;
    }
    public void moveTo(Actor anActor, Direction dir){
        Room r = anActor.getLocation();
        Room exit;
        switch (dir) {
            case FORWARD:
                exit = r.linked().getForward().getCurrentRoom();
                break;
            case BACK:
                exit = r.linked().getBack().getCurrentRoom();
                break;
            case RIGHT:
                exit = r.linked().getRight().getCurrentRoom();
                break;
            case LEFT:
                exit = r.linked().getLeft().getCurrentRoom();
                break;
            default:
                exit = Direction.NOEXIT;
                break;
        }
        if (!exit.getNullity()){
            moveActorTo(anActor, exit);
        }else{
            exit = r.linked().getCurrentRoom();
            System.out.println("You can't go in that direction");
        }
    }
    public void moveActorTo(Actor p, Room location){
        p.setLocation(location);
    }
 
}
