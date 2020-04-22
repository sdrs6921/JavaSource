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
		mf.setSize(300, 200);//������ â ũ������
		mf.setVisible(true);//������ â ���̰� ����
		Thread th = new Thread(mf);//������ ����
		th.start();//������ Ready -> �����ϰ� �ϴ� �� �ü���� ������
	}

}
