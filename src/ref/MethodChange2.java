package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메소드 호출 전 : dataA.value = " + dataA.value);
        System.out.println("dataA = " + dataA);
        changeReference(dataA);
        System.out.println("메소드 호출 후 : data.value = " + dataA.value);

    }
    static void changeReference(Data dataX){
        System.out.println("dataX = " + dataX);
        dataX.value = 20;
    }

}
