package HomeWork2.Order;

import java.util.ArrayList;

public interface DAO {
	void insert(Order order); //�ֹ� ���

	int getIdByNum(int num); //�ֹ� ��ȣ�� �˻� �� �迭 �� index ��ȯ

	Order selectByNum(int num); //�ֹ� ��ȣ�� �˻�

	ArrayList<Order> selectAll(); //��ü �˻�

	void delete(int num); //�ֹ� ��ȣ�� �˻� �� ��ü ����

	ArrayList<Order> selectByPayfalse(); // ���� ��� ���

	ArrayList<Order> selectByRelease(); //��� ��� ���
}
