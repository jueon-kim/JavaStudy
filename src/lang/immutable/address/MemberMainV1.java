package lang.immutable.address;

public class MemberMainV1 {
    public static void main(String[] args) {

        Address address = new Address("서울");

        MemberV1 memberA = new MemberV1("회원A", address);
        MemberV1 memberB = new MemberV1("회원B", address);

        //회원A 회원B 처음 주소는 모두 사용
        System.out.println("MemberA" + memberA);
        System.out.println("MemberB" + memberB);

        //회원B의 주소를 부산으로 변경해야함
        memberB.getAddress().setValue("부산");
        System.out.println("부산 -> memberB.address");
        System.out.println("MemberA = " + memberA);
        System.out.println("MemberB = " + memberB);
    }
}
