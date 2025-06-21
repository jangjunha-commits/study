abstract class Animal_obj {
    //abstract method
    public abstract void animalSound();
    //regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}

class Pigs extends Animal_obj {
    public void animalSound() {
        System.out.println("wee wee");
    }
}

public class 추상화 {
    public static void main(String[] args) {
        /*
        추상클래스 메서드
        추상화 - 특정 세부사항을 숨기고 사용자에게 필수정보만 보여주는 과정입니다
        추상적인 클래스나 인터페이스를 통해 달성할수 있습니다
        abstract 키워드는 클래스와 메서드를 사용되는 비접근 방법입니다
        추상클래스 - 객체를 생성하는데 사용할수 없는 제한된 클래스 입니다
        추상 방법 - 추상클래스에서만 사용할수 있으며 본문에 없습니다
        abstract class Animal {
           public abstract void animalSound() {
               public void sleep(){
                  System.out.println("Zzz");
               }
            }
        }
        //동물클래스의 객체를 생성하는 것을 불가능합니다
        Animal obj = new Animal(); //will generate an error
        추상클래스에 엑세스 하려면 다른 클래스에서 상속받아야합니다
         */
        Pigs pigs = new Pigs();
        pigs.animalSound();
        pigs.sleep();
    }
}
