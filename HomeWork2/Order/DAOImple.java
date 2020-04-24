package HomeWork2.Order;

import java.util.ArrayList;

public class DAOImple implements DAO {
	private ArrayList<Order> datas;

	public DAOImple() {
		datas = new ArrayList<Order>();
	}

	@Override
	public void insert(Order order) {
		// TODO Auto-generated method stub
		datas.add(order);
	}

	@Override
	public int getIdByNum(int num) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Order selectByNum(int num) {
		// TODO Auto-generated method stub
		int idx = datas.indexOf(num);

		if (idx < 0) {
			System.out.println("�ش� �ֹ� ��ȣ�� �������� �ʽ��ϴ�.");
		} else {
			return datas.get(num);
		}

		return null;
	}

	@Override
	public ArrayList<Order> selectAll() {
		// TODO Auto-generated method stub
		return datas;
	}

	@Override
	public void delete(int num) {
		// TODO Auto-generated method stub
		if (datas.indexOf(num) < 0) {
			System.out.println("�ش� �ֹ���ȣ�� �������� �ʽ��ϴ�.");
		} else {
			if (datas.get(num).isPaid()) {
				System.out.println("�̹� ������ �ֹ��� ��Ұ� �Ұ��� �մϴ�.");
			}
			else {
				datas.remove(num);
			}
		}
	}

	@Override
	public ArrayList<Order> selectByPayfalse() {
		// TODO Auto-generated method stub
		ArrayList<Order> dat = new ArrayList<Order>();
		
		for (Order o : datas) {
			if (!o.isPaid()) {
				dat.add(o);
			}
		}
		return dat;
	}

	@Override
	public ArrayList<Order> selectByRelease() {
		// TODO Auto-generated method stub
		ArrayList<Order> dat = new ArrayList<Order>();
		
		for (Order o : datas) {
			if (o.isPaid() && (!o.isReleased())) {
				dat.add(o);
			}
		}
		return dat;
	}

}
