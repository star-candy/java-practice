package Day20241127;

public class RubberDuck extends Duck{
	public RubberDuck() {
		System.out.println("고무오리 생성");
		this.flyBehavior = new FlyNoWay(); //고무오리는 못난다.
		this.quackBehavior = new Squeak();
		
	}

}
