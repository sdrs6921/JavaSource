package HomeWork2.Order;

public class DAOImple implements DAO {
	private Order[] datas;
	private int cnt = 0;

	public DAOImple() {
		// TODO Auto-generated constructor stub
		datas = new Order[30];
	}

	@Override
	public void insert(Order order) {
		// TODO Auto-generated method stub
		if (cnt > 30) {
			System.out.println("저장 공간이 부족합니다. 주문 접수를 취소합니다.");
			return;
		}
		datas[cnt++] = order;
	}

	@Override
	public int getIdByNum(int num) {
		// TODO Auto-generated method stub
		for (int i = 0; i < cnt; i++) {
			if (datas[i].getNum() == num) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public Order selectBynum(int num) {
		// TODO Auto-generated method stub
		int idx = getIdByNum(num);
		if (idx >= 0) {
			return datas[idx];
		}
		return null;
	}

	@Override
	public Order[] selectAll() {
		// TODO Auto-generated method stub
		Order[] x = new Order[cnt];
		System.arraycopy(datas, 0, x, 0, cnt);
		return x;
	}

	@Override
	public void delete(int num) {
		// TODO Auto-generated method stub
		int idx = getIdByNum(num);

		if (idx < 0) {
			System.out.println("주문 내용이 없습니다.");
		} else {
			for (int i = idx; i < cnt; i++) {
				datas[i] = datas[i + 1];
			}
			cnt--;
		}
	}

	@Override
	public Order[] selectByPayfalse() {
		// TODO Auto-generated method stub
		Order[] x = new Order[cnt];
		int j = 0;
		for (int i = 0; i < cnt; i++) {
			if (!datas[i].isPaid()) {
				x[j++] = datas[i];
			}
		}

		Order[] y = new Order[j];
		System.arraycopy(x, 0, y, 0, j);

		return y;
	}

	@Override
	public Order[] selectByRelease() {
		// TODO Auto-generated method stub
		Order[] x = new Order[cnt];
		int j = 0;

		for (int i = 0; i < cnt; i++) {
			if (datas[i].isPaid() && (!datas[i].isReleased())) {
				x[j++] = datas[i];
			}
		}

		Order[] y = new Order[j];

		System.arraycopy(x, 0, y, 0, j);

		return y;
	}

}
