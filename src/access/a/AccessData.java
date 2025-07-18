package access.a;

public class AccessData {

    public int publicField;
    int defaultField;
    private int privateField;

    public void publicMethod(){
        System.out.println("publicMethod 호출 " + publicField);
    }

    void defaultMethod() {
        System.out.println("defaultMethod 호출 " + defaultField);
    }

    void privateMethod() {
        System.out.println("privateMethod 호출 " + privateField);
    }
    public void innerAacess() {
        System.out.println("내부 호출");
        defaultField = 200;
        publicField = 300;
        privateField = 300;

        publicMethod();
        defaultMethod();
        privateMethod();
    }

}
