package Practices.Dog;

public class Dog {
    public String name;
    public String breedName;

    public Dog(){

    }
    public Dog(String name,String breed){
        this.name=name;
        this.breedName=breed;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name=name;
    }
    public String getBreedNameName()
    {
        return this.breedName;
    }

    public void setBreedNameName(String name)
    {
        this.breedName=name;
    }

    public void displayInfo(){
        System.out.println("The dog is "+name+" The Breed is: "+breedName);
    }

    public static void main(String[] args) {
        Dog dog1=new Dog("Bojo","Indian");
        Dog dog2=new Dog("Yadab","Telegu");
        dog1.displayInfo();
        dog1.setName("Pojo");
        dog1.displayInfo();

    }

}
