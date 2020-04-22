package HomeWork2.Order;

import HomeWork2.Factory.Product;

public interface DAO {
	void insert(Order order); //�ֹ� ���

	int getIdByNum(int num); //�ֹ� ��ȣ�� �˻� �� �迭 �� index ��ȯ

	Order selectByNum(int num); //�ֹ� ��ȣ�� �˻�

	Order[] selectAll(); //��ü �˻�

	void delete(int num); //�ֹ� ��ȣ�� �˻� �� ��ü ����

	Order[] selectByPayfalse(); //���� ��� ���

	Order[] selectByRelease(); //��� ��� ���
}
