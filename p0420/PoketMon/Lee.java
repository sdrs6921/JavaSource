package p0420.PoketMon;

public class Lee extends PoketMon {
	public Lee() {
		name = "ÀÌ»óÇØ¾¾";
		hp = 20;
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
		hp += 7;
	}

	@Override
	public boolean play() {
		// TODO Auto-generated method stub
		// super.play();
		hp -= 9;
		hp += 6;
		levelCheck();
		return hp > 0;
	}

	@Override
	public boolean exercise() {
		// TODO Auto-generated method stub
		// super.exercise();
		hp -= 12;
		hp += 12;
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
		if (exp >= 40) {
			level++;
			exp -= 40;
			System.out.println(name + " ·¹º§ ¾÷!");
		}
	}

	public void ³ÕÄð°ø°Ý() {
		System.out.println("³ÕÄð°ø°Ý");
	}
}
