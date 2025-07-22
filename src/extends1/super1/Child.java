package extends1.super1;


public class Child extends Parent {

    public String value = "child";

    @Override
    public void hello() {
        System.out.println("Child.hello");
    }

    public void call() {
        System.out.println("this value = " + this.value); // 자신 타입에서 찾는것 생략가능
        System.out.println("this value = " + super.value); // 부모 타입에서 찾는것

        this.hello();
        super.hello();
    }
}
