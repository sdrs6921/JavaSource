package p0421.animal;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalAction a = new AnimalAction();
		Dog d = new Dog();
		d.name = "������";
		a.action(d);
		
		Cat c = new Cat();
		c.name = "�����";
		a.action(c);
	}

}
