package Day20241127;

public abstract class Duck {
	FlyBehavior flyBehavior; //행동 변수 = 메서드 변수, 변수는 상속해도 오버라이드 x
	QuackBehavior quackBehavior;
	
	public Duck() {}
	
	public void setFlyBehavior(FlyBehavior fb) { //객체 주입
		flyBehavior = fb; //중간에 행동 변경 가능
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
	
	public void performFly() {
		flyBehavior.fly(); //일단 날것, 
	}
	
	public void performQuack() {
		quackBehavior.quack(); //위임 변수, 행동 부르기만 함
	}
	
}
