package Day20241127;

public class SimDuckApp {
	public static void main(String[] args) {
		RedHeadDuck rd = new RedHeadDuck();
		WoodDuck wd = new WoodDuck();
		System.out.println("오리 날개 선택 : 1, 2, 3 : ");
		int flyChoice = 1;
		if(flyChoice == 1) {
			rd.setFlyBehavior(new FlyWithWings());
			rd.performFly();
		}
		else if (flyChoice == 2) {
			rd.setFlyBehavior(new FlyNoWay());
			rd.performFly();
		}
		else if (flyChoice == 3) {
			rd.setFlyBehavior(new FlyAiWings());
			rd.performFly();
		}
		else if (flyChoice == 4) {
			wd.setQuackBehavior(new Quack()); //다시 말하기 가능
		}
		
		//rd.setFlyBehavior(new FlyAiWings()); //setter로 행동 변경 가능
		//rd.performFly();
		
		//RubberDuck ru = new RubberDuck();
		//ru.performFly(); //못난다.
		//ru.performQuack();
	}

}
