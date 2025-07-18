package memory;

public class JavamemorMain1 {
    public static void main(String[] args) {
        System.out.println("main start");
        method1(10);
        System.out.println("main end");
    }

    static void method1(int m1){
        System.out.println("method1 start");
        int cal = m1 =2;
        method2(cal);
        System.out.println("method2 end");

    }

    static void method2(int m2){
        System.out.println("method m2 start");
        System.out.println("method m2 end");
    }
}
