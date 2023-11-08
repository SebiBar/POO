package Advanced1;
//Create a gorilla class which implements the Animal interface.
interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

class Gorilla implements Animal{
    public boolean feed(boolean timeToEat){
        //give banana
        return true;
    }
    public void groom(){
        //pat pat
    }
    public void pet(){
        //pet pet
    }
}
