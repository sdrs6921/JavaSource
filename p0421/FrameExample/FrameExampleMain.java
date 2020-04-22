package p0421.FrameExample;

import java.awt.Frame;

class MyFrame extends Frame implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			this.setTitle("myframe :" + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

public class FrameExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame mf = new MyFrame();
		mf.setSize(300, 200);//윈도우 창 크기지정
		mf.setVisible(true);//윈도우 창 보이게 설정
		Thread th = new Thread(mf);//쓰레드 생성
		th.start();//쓰레드 Ready -> 시작하게 하는 건 운영체제의 역할임
	}

}
