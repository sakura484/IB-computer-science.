public class Main
{
    public static void main(String[] args)
    {
        Animal myAnimal = new Animal();
        Animal myCat = new Cat();
        Animal myDog=new Dog();


        myAnimal.makeSound();
        myCat.makeSound();
        myDog.makeSound();
        Cat myCat2=new Cat("cute");
        System.out.println(myCat2.getName());

    }

}
