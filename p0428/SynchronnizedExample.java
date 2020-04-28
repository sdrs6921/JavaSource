package p0428;

class Msg {
	private String str;

	public synchronized String getStr() {
		return str;
	}

	public synchronized void setStr(String str) {
		this.str = str;
	}
	
	public  synchronized void printStr() {
		System.out.println(str);
	}
}
class Test4 extends Thread {
	private Msg msg;
	
	public Test4 (Msg msg) {
		this.msg = msg;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		synchronized (msg) {
			for (int i = 0; i < 10; i++) {
				msg.setStr("파생쓰레드");
				try {
					sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.print("파생쓰레드 str:");
				msg.printStr();
			}
		}
		
	}
	
	
}

public class SynchronnizedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Msg msg = new Msg();
		Test4 t = new Test4(msg);
		t.start();
		for (int i = 0; i < 10; i++) {
			msg.setStr("main쓰레드");
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print("main쓰레드 str:");
			msg.printStr();
		}
	}

}
