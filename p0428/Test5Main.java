package p0428;

class Data {
	private int[] arr = new int[10];
	private int idx_in = 0; // Data 저장위치
	private int idx_out = 0; // 데이터 빼는 위치
	private int cnt = 1;

	public synchronized void put() {
		if (idx_in - idx_out >= 3) {
			notifyAll();
		}

		if (idx_in - idx_out == arr.length) {
			try {
				System.out.println("Full 생산자 대기모드");
				wait();
				System.out.println("생산자 깨어남");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		arr[idx_in % arr.length] = cnt;
		System.out.println(arr[idx_in % arr.length] + "생산");
		cnt++;
		idx_in++;
	}
	
	public synchronized void get() {
		if (idx_in - idx_out <= 7) {
			notifyAll();
		}
		if (idx_in == idx_out) {
			try {
				System.out.println("empty. 소비자 대기 모드");
				wait();
				System.out.println("소비자 깨어남");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(arr[idx_out % arr.length] + "소비");
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
