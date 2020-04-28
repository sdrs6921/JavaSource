package p0428;

class Data {
	private int[] arr = new int[10];
	private int idx_in = 0; // Data ������ġ
	private int idx_out = 0; // ������ ���� ��ġ
	private int cnt = 1;

	public synchronized void put() {
		if (idx_in - idx_out >= 3) {
			notifyAll();
		}

		if (idx_in - idx_out == arr.length) {
			try {
				System.out.println("Full ������ �����");
				wait();
				System.out.println("������ ���");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		arr[idx_in % arr.length] = cnt;
		System.out.println(arr[idx_in % arr.length] + "����");
		cnt++;
		idx_in++;
	}
	
	public synchronized void get() {
		if (idx_in - idx_out <= 7) {
			notifyAll();
		}
		if (idx_in == idx_out) {
			try {
				System.out.println("empty. �Һ��� ��� ���");
				wait();
				System.out.println("�Һ��� ���");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(arr[idx_out % arr.length] + "�Һ�");
		idx_out++;
	}
}

class Consumer extends Thread {
	private Data data;

	public Consumer() {
		// TODO Auto-generated constructor stub
	}

	public Consumer(Data data) {
		this.data = data;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 50; i++) {
			data.put();
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

class Producer extends Thread {
	private Data data;
	public Producer() {
		
	}
	
	public Producer(Data data) {
		this.data = data;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (int i = 0; i < 50; i++) {
			data.get();
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Test5Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d = new Data();
		Producer p = new Producer(d);
		Consumer c = new Consumer(d);
		p.start();
		c.start();
	}

}
