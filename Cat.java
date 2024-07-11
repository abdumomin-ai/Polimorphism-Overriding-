public class Cat extends Animal{

    public  String sound(String sound){
        return sound;
    }

    public String getName(String name){
        return name;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.sound("meow meow"));
        System.out.println(cat.getName("Mr.NotDog"));
    }
}
