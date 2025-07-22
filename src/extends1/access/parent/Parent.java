package extends1.access.parent;

public class Parent {

    public int publicValue;
    protected int protectedValue;
    int defaultValue;
    private int privateValue;

    public void publicMethod() {
        System.out.println("Parent.publicMethod");

    }

    public void protectedValue() {
        System.out.println("Parent.protectValue");

    }

    protected void protectedMethod(){
        System.out.println("Parent.protectMethod");

    }

    void defaultMethod() {
        System.out.println("Parent.defaultMethod");

    }

    public void privateValue() {
        System.out.println("Parent.privateMethod");

    }

    public void printParent() {
        System.out.println("==Parent 메서드안");
        System.out.println("publicMethod = " + publicValue);
        System.out.println("protectedValue = " + protectedValue);
        System.out.println("defaultMethod + " + defaultValue);
        System.out.println("privateValue + " + privateValue);

        defaultMethod();
        privateValue();

    }
}
