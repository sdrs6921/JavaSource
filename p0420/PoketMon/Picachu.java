package p0420.PoketMon;

class Picachu extends PoketMon {

	public Picachu() {
		name = "피카츄";
		hp = 10;
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		// super.eat();
		hp += 5;
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		// super.sleep();
		hp += 8;
	}

	@Override
	public boolean play() {
		// TODO Auto-generated method stub
		// super.play();
		hp -= 10;
		exp += 8;
		levelCheck();
		return hp > 0;
	}

	@Override
	public boolean exercise() {
		// TODO Auto-generated method stub
		// super.exercise();
		hp -= 15;
		exp += 15;
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
		if (exp >= 30) {
			level++;
			exp -= 30;
			System.out.println(name + " 레벨 업!");
		}
	}

	public void 전기공격() {
		System.out.println("백만볼트");
	}
}