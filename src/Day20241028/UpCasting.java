package Day20241028;

class Person {
}

class Student extends Person {
}
//업 케스팅 : 상속 관계에서 하위 객체가 상위 객체의 변수로 적용되는 방법 (부모로 자식 가리키기)
//다운 케스팅 : 상속 관계에서 상위 객체가 하위 객체의 변수로 적용되는 방법 (자식으로 부모 가리키기) - 명시적 형변환 필요
public class UpCasting {
    public static void main(String[] args) {
        Student aaa = (Student)new Person(); //명시적 형변환 해야 가능 - 다운케스팅


        int a = 100;
        double b = a; //자동 형 변환
        
        float f = 100.0f;
        int c = (int) f; //강제(명시적) 형 변환
        
        Object o = new Student(); //업캐스팅 가능
        Object o1 = new Person(); //업캐스팅 가능 obj는 최상위 클래스임
        
        Person p1 = new Person();
        System.out.println(p1 instanceof Person); //true, p1은 Person의 객체인가?

        Student s1 = new Student();
        System.out.println(s1 instanceof Person); //true, s1은 Person의 객체인가?

        Student s2 = new Student();
        System.out.println(s2 instanceof Person); //true, s2는 Person의 객체인가? 상속 관계이므로 true 업케스팅 결과임

        Person p = new Student(); //업캐스팅 가능
        System.out.println(p instanceof Person);
        System.out.println(p instanceof Student); //true, p는 Student의 객체인가? 업캐스팅 결과임

        //다운 케스팅은 불가 - 자식 타입으로 부모 객체 가리키지 말 것
    }
}
