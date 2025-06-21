class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("wee wee");
    }
}

class Dog extends  Animal {
    public void animalSound() {
        System.out.println("bow wow");
    }
}

public class 다형성 {
    public static void main(String[] args) {
        /*
        클래스의 속성과 메서드를 상속할수 있게해줍니다
        다형성 - 다양한 작업을 수행합니다
        다양한 방식으로 단일작업을 수행합니다
        슈퍼클래스를 생각해보세요
        Animal 다음과 같은 방법이 있습니다
        animalSound() 동물 하위분류는 돼지 고양이 개 새 일수 있다
        돼지가 짖는 소리 고양이가 우는 소리 자체적으로 동물소리를 구현할수 있다
         */
        Animal animal = new Animal();
        Animal pig = new Pig();
        Animal dog = new Dog();
        animal.animalSound();
        pig.animalSound();
        dog.animalSound();

    }
}
