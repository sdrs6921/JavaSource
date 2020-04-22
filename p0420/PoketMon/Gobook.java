package p0420.PoketMon;

public class Gobook extends PoketMon {
	public Gobook() {
		name = "꼬북이";
		hp = 15;
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		// super.eat();
		hp += 3;
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		// super.sleep();
		hp += 5;
	}

	@Override
	public boolean play() {
		// TODO Auto-generated method stub
		// super.play();
		hp -= 8;
		exp += 6;
		levelCheck();
		return hp > 0;
	}

	@Override
	public boolean exercise() {
		// TODO Auto-generated method stub
		// super.exercise();
		hp -= 10;
		exp += 10;
		levelCheck();
		return hp > 0;
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
	}

	@Override
	public void levelCheck() {
		// TODO Auto-generated method stub
		// super.levelCheck();
		if (exp >= 20) {
			level++;
			exp -= 20;
			System.out.println(name + " 레벨 업!");
		}
	}

	public void 물대포() {
		System.out.println("물대포");
	}

}
