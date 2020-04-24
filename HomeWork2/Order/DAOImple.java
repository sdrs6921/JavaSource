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
		for (Order o : datas) {
			if (num == o.getNum()) {
				return o;
			}
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
		for (int i = 0; i < datas.size(); i++) {
			Order o = datas.get(i);
			if (num == o.getNum()) {
				if (o.isPaid()) {
					System.out.println("이미 결제한 주문은 취소불가");
				} else {
					datas.remove(i);
				}
				return;
			}
		}
		System.out.println("없는 번호. 삭제 취소");
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
