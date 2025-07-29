package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        System.out.println("Parent -> parent");
        Parent parent = new Parent();
        parent.parentMethod();

        //자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        //부모 변수가 자식 인스턴스 참조 (다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();

//        Child child1 = new Prent(); 자식은 부모를 담을수 없다
//        자식의 기능은 호출 할수 없다. 컴파일 오류 발생
//        poly.parentMethod();
    }
}
