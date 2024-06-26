abstract class Duck {
    void quack(){
        System.out.println("Kwek-kwek");
    }
    void swim() {
        System.out.println("Berenang");
    }
    abstract void display();
    void fly(){
        System.out.println("Terbang");
    }
}
class MallardDuck extends Duck{

    @Override
    void display() {
        System.out.println("Tampilan MallardDuck");
    }
}
class RedheadDuck extends Duck{

    @Override
    void display() {
        System.out.println("Tampilan RedheadDuck");
    }
}
class RubberDuck extends Duck{

    @Override
    void display() {
        System.out.println("Tampilan RubberDuck");
    }
    @Override
    void quack(){
        System.out.println("Bunyinya queek, bukan qwak");

    }
    @Override
    void fly(){

    }
}
class WoodenDuck extends Duck {
    @Override
    void display() {
        System.out.println("Tampilan WoodenDuck");
    }
    @Override
    void quack(){
    }

    @Override
    void swim(){
        System.out.println("Mengambang");
    }

    @Override
    void fly(){
    }
}