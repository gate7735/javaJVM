package ch06;

// 클래스는 단지 객체에 대한 내용만 기술했을 뿐이지 사용할 수 있는 객체는 아님
// 클래스는 단지 설계일 뿐이고 실제로 사용하려면 설계대로 만든 객체를 메모리에 생성
// 이처럼 설계한 내용대로 메모리에 객체를 생성하는 명령문은 new
// new Armor() <- Armor 클래스의 인스턴스 <= 메모리의 힙 영역에 생성됨 (단 인스턴스가 가지고 있는 메서드는 코드 영역에 생성된 내용을 사용)
// 정적(static) 멤버는 프로그램이 시작될 때 딱 한 번 메모리의 코드 영역에 할당되며 프로그램이 종료될 때까지 유지
// main() 메서드가 시작되기 전에 static 으로 선언된 정적 멤버를 코드 영역에 할당
public class Armor {
    private String name; // 인스턴스 필드
    private int height; // 인스턴스 필드
    static int count; // 클래스 필드 <- main 메서드 실행 전에 이미 코드 메모리에 생성

    // 일반적으로 클래스의 필드를 private로 선언
    // 게터/세터를 이용해 검증된(개발자가 의도하는) 접근만 가능하게 함
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    static {
        System.out.println("static : hello");
        System.out.println("static : java");
    }
}
