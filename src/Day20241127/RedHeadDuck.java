package Day20241127;

public class RedHeadDuck extends Duck{//추상x 오버라이드 없음
	public RedHeadDuck() {
		System.out.println("redHeadDuck 생성");
		this.flyBehavior = new FlyWithWings(); //오리 나는 기능 추가됨, but 중간에 못바꿈(setter x 문제)
		this.quackBehavior = new Quack(); //정상 울음소리
	}
	
	
}
