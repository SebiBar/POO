package Lab031;

public class Dog {
    public Dog(String n, int a){
        name = n;
        age = a;
    }

    private String name;
    private int age;

    public void setName(String newName){
        this.name = newName;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
}
