package gameObjects;

public abstract class Thing {
    private String description;
    private String name;
    private boolean isNull;

    public void setDescription(String description) {
        this.description = description;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public String getName() {
        return name;
    }
    public void setNullity(boolean isNull){
        this.isNull = isNull;
    }
    public boolean getNullity(){
        return isNull;
    }
}
