public class Cat extends Animal
{

    String name;
    Cat(){}
    Cat (String name)
    {
        this.name=name;
    }
    public void makeSound()
    {
        super.makeSound();
        System.out.println("Meow Meow");

    }
    public String getName()
    {
        return name;
    }

}
