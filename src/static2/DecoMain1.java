package static2;

import java.util.stream.DoubleStream;

public class DecoMain1 {
    public static void main(String[] args) {
        String s = "hello java";
        DecoUtil1 utils = new DecoUtil1();
        String deco = utils.deco(s);

        System.out.println("befor: " + s);
        System.out.println("after: " + deco);
    }
}
