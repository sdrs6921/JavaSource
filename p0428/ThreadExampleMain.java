package p0428;
class Test1 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//Thread를 상속 받으면 run()에 쓰레드의 동작을 구현!
		//쓰레드가 시작되면 이 메서드가 실행됨
		//이 메서드에 더 이상 실행될 것이 없으면 자동으로 쓰레드 종료
		for (int i = 1; i <= 27; i++) {
			System.out.print(i + "\t");
		}
	}
}

public class ThreadExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t = new Test1();
		t.start();
		
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.print(i + "\t");
		}
	}

}
