public class Dog extends Animal {
    public void bark(){
        System.out.println(name + "is barking");
    }


    @Override
    public void eat() {
        System.out.println(name + "is eating bone");
    }
}
