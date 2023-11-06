package Lab4;

public class Dog {
    public Dog(String n, String b){
        name = n;
        breed = b;
    }
    private String name;
    private String breed;
    public void setName(String newName){
        this.name = newName;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public String getName(){
        return this.name;
    }
    public String getBreed(){
        return this.breed;
    }
}


