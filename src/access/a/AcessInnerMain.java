package access.a;

public class AcessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        data.publicField = 1;
        data.publicMethod();

        data.defaultField = 2;
        data.defaultMethod();

//        data.privateField = 3;

        data.innerAacess();
    }
}
