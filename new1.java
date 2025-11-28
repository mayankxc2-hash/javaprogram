abstract class Animal{
    abstract void makesound();
}
class cat extends Animal{
    void makesound(){
        System.out.println("meow");
    }

}

public class new1{
    public static void main(String[] args){
        Animal a = new cat();
        a.makesound();
        }
    }
