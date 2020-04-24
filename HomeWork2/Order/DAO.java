package HomeWork2.Order;

import java.util.ArrayList;

public interface DAO {
	void insert(Order order); //주문 등록

	int getIdByNum(int num); //주문 번호로 검색 후 배열 위 index 반환

	Order selectByNum(int num); //주문 번호로 검색

	ArrayList<Order> selectAll(); //전체 검색

	void delete(int num); //주문 번호로 검색 후 객체 삭제

	ArrayList<Order> selectByPayfalse(); // 결제 대상 목록

	ArrayList<Order> selectByRelease(); //출고 대상 목록
}
