package ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        ProductOrder dubu = new ProductOrder();
        dubu.productName = "두부";
        dubu.price = 2000;
        dubu.qunatity = 2;
        orders[0] = dubu;

        ProductOrder kimchi = new ProductOrder();
        kimchi.productName = "김치";
        kimchi.price = 5000;
        kimchi.qunatity = 1;
        orders[1] = kimchi;

        ProductOrder cock = new ProductOrder();
        cock.productName = "콜라";
        cock.price = 1500;
        cock.qunatity = 2;
        orders[2] = cock;

           int sum = 0;
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + "상품 가격: " + order.price + "상품 수량: " + order.qunatity);
            sum += order.price * order.qunatity;
            }
        System.out.println("총결제 금액: " + sum);
    }
}
