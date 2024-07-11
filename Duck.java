public class Duck extends Animal{

    public  String sound(String sound){
        return sound;
    }

    public String getName(String name){
        return name;
    }

    public static void main(String[] args) {
        Duck duck = new Duck();
        System.out.println(duck.sound("quack quack"));
        System.out.println(duck.getName("Mr.NotBeast"));
    }
}
