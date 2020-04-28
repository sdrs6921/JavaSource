package p0428.chating;

import java.util.Vector;

public class ChatRoom {
	// Vector�� ArrayList�� �ٸ��� ����ȭ ó���� �Ǿ�����.
	// �׷��� Vector�� �����带 �����ϴ� �ڷᱸ���� ����
	private	Vector<ChatThread> members;
	
	public ChatRoom() {
		members = new Vector<ChatThread>();
	}
	
	public void addMember(ChatThread ch) {
		members.add(ch);
	}
	
	public void deleteMember(ChatThread ch) {
		members.remove(ch);
	}
	
	public void sendMsgAll(String msg) {
		for (ChatThread ch : members) {
			ch.sendMsg(msg);
		}
	}
}
