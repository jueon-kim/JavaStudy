package static2;

public class DecoData {

    private int instanceValue;
    private static  int staticValue;

    public static void staticCall() {
//        instanceValue++; 인스턴스 변수 접근 error
//        instanceMethod();  인스턴스 메스더 접근 error

        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근
    }

    public void instanceCall(){
        instanceMethod();
        instanceValue++;

        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근
    }

    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);

    }

    private static void staticMethod(){
        System.out.println("staticValue = " + staticValue);
    }

    public static void staticCall(DecoData data) {
        data.instanceValue++;
        data.instanceMethod();
    }
}
