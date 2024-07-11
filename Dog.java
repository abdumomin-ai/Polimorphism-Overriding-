public class Dog extends Animal{

    public  String sound(String sound){
        return sound;
    }

    public String getName(String name){
        return name;
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.sound("bow bow"));
        System.out.println(dog.getName("Mr.NotCat"));
    }
}
