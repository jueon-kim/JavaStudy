package poly.ex6;


public class SoundFlyMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        soundAnimal(dog);
        soundAnimal(bird);
        soundAnimal(chicken);

        flyAnimal(bird);
        flyAnimal(chicken);
    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료 ");
    }

    //Fly인터페이스가 있으면 사용 가능
    private static void flyAnimal(Fly fly) {
        System.out.println("날개 테스트 시작");
        fly.fly();
        System.out.println("날개 테스트 종료");
    }
}
