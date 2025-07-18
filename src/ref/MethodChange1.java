package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메소드 호출 전 = " + a);

        changeReference(a);
        System.out.println("메서드 호출 후 = " + + a);
    }
    static void changeReference(int x){
        x = 20;
    }
}
