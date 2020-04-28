package p0428;
class Test3 extends Thread {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 101; i++) {
			System.out.println(getName() + ":" + i);
			try {
				sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(getName() + "쓰레드 종료 우선순위:" + getPriority());
	}
	
}

public class ThreadPriorityExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 11; i++) {
			Test3 t = new Test3();
			t.setPriority(i);
			t.start();
		}
 	}

}
