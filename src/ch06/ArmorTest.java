package ch06;

public class ArmorTest {
    int num = 123;

    // main() 메서드는 인터스턴스를 생성하는 명령문이 나오기 전에 실행
    // static 으로 선언한 메서드는 프로그램 시작 시 자동으로 사용 준비를 완료
    public static void main(String args[]) {
        Armor.count++;

        Armor suit1 = new Armor();
        Armor suit2 = new Armor();
        Armor suit3 = new Armor();

        suit1.setName("mark6");
        suit1.setHeight(180);
        suit2.setName("mark16");
        suit2.setHeight(220);
        suit3.setName("mark38");
        suit3.setHeight(200);

        System.out.println(Armor.count);

        System.out.println(suit1.getName() + " : " + suit1.getHeight());
        System.out.println(suit2.getName() + " : " + suit2.getHeight());
        System.out.println(suit3.getName() + " : " + suit3.getHeight());

        ArmorTest.parint1();

        // 인스턴스 메서드를 호출하려면 인스턴스를 생성한 후 참조변수를 이용
        ArmorTest armorTest = new ArmorTest();
        armorTest.print2();
    }

    // 클래스 메서드이므로 main() 메서드가 실행되기 전에 사용 준비가 완료
    // num 필드는 인스턴스 필드. 즉 인스턴스가 생성된 후 사용 가능
    public static void parint1(){
        System.out.println("hello");
        // int num2 = num;
    }

    public void print2() {
        System.out.println("java");
        int num3 = num;
    }
}
