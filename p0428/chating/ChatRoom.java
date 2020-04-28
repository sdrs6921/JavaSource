package p0428.chating;

import java.util.Vector;

public class ChatRoom {
	// Vector는 ArrayList와 다르게 동기화 처리가 되어있음.
	// 그래서 Vector는 쓰레드를 관리하는 자료구조로 적합
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
