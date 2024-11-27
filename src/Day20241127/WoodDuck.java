package Day20241127;

public class WoodDuck extends Duck{
	public WoodDuck() {
		System.out.println("목각 오리 생성");
		
		this.flyBehavior = new FlyNoWay();
		this.quackBehavior = new MuteQuack();
	}

}
