class Animal{
    void walk(){
        System.out.println("I can walk.");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("I can fly.");
    }
}

public class Main {
    public static void main(String[] args){
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
    }
}
